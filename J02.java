// �h���~��
interface iShape03 //�ɭ� iShape03
{
 public void show();
 public int area();
}
interface iColor //�ɭ� iColor
{
 public void showColor();
}
class CWin
{
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w,int h,String str) //�غc���A�Цۦ�]�p
	{
		width=w;
		height=h;
		color=str;
	}
public void show() //��k 1�A�Цۦ�]�p
 {
	showColor();
	System.out.println("width="+width);
	System.out.println("height="+height);
	System.out.println("height="+area());

 }
 public int area() //��k 2�A�Цۦ�]�p
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