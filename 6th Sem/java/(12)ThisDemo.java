import java.util.Scanner;
class Rectangle
{
	int length,breadth;
	void set(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	int getarea()
	{
		return (length*breadth);
	}
}

class ThisDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Rectangle r=new Rectangle();
		int l,b;
		System.out.println("Enter length and breadth of rectangle:");
		l=s.nextInt();
		b=s.nextInt();
		r.set(l,b);
		System.out.println("Area of the rectangle:"+r.getarea()); 
	}
}