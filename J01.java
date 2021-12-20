import java.util.*;
class RuntimeException extends Exception
{
	
}
public class J01
{
   public static void main(String args[])
   {
     Scanner scn=new Scanner(System.in);
     int req,req2;
     System.out.print("請輸入密碼:");
     req=scn.nextInt();
     int n = 0; 
     try{
    	 System.out.print("請再輸入一次密碼:");
    	 for(int a=0;a<=3;a++) { 
         req2=scn.nextInt();
    	 if(req!=req2) {
		     System.out.println("與第一次的輸入不同");
		     if (n!=3) {
	    		 System.out.print("請再輸入一次密碼:");
	    		 n+=1;
	    		 }
		     else if(n==3){
		    	 throw new RuntimeException();
		     }
    	 }
	     else
	     {
	           System.out.println("密碼正確");
	           break;
	     }
     	}
        }
     catch(RuntimeException e)
     {
    	 System.out.println("輸入三次錯誤！程式停止！");
	 }
   }
}