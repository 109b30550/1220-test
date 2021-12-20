// 多重繼承
interface iShape03 //界面 iShape03
{
 public void show();
 public int area();
}
interface iColor //界面 iColor
{
 public void showColor();
}
class CWin
{
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w,int h,String str) //建構元，請自行設計
	{
		width=w;
		height=h;
		color=str;
	}
public void show() //方法 1，請自行設計
 {
	showColor();
	System.out.println("width="+width);
	System.out.println("height="+height);
	System.out.println("height="+area());

 }
 public int area() //方法 2，請自行設計
 {
	return width*height;
 }
 public void showColor()
 {
	 System.out.println("color="+color);
 }

public class J02{
	public static void main(String args[])
	{
		CWin win=new CWin(5,7,"Green");
		win.show();
		}
	}
}
//output:
//color=Green
//width=5
//height=7
//height=35