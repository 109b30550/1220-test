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
     System.out.print("�п�J�K�X:");
     req=scn.nextInt();
     int n = 0; 
     try{
    	 System.out.print("�ЦA��J�@���K�X:");
    	 for(int a=0;a<=3;a++) { 
         req2=scn.nextInt();
    	 if(req!=req2) {
		     System.out.println("�P�Ĥ@������J���P");
		     if (n!=3) {
	    		 System.out.print("�ЦA��J�@���K�X:");
	    		 n+=1;
	    		 }
		     else if(n==3){
		    	 throw new RuntimeException();
		     }
    	 }
	     else
	     {
	           System.out.println("�K�X���T");
	           break;
	     }
     	}
        }
     catch(RuntimeException e)
     {
    	 System.out.println("��J�T�����~�I�{������I");
	 }
   }
}