import java.util.Scanner;
interface shape
{
	static final double PI=3.14;
	public void setradius(double r);
	public double getarea();
}

class Circle implements shape
{
	double radius;

	public void setradius(double r)
	{
		radius=r;
	}

	public double getarea()
	{
		return 3.14*radius*radius;
	}
}

class Sphere implements shape
{
	double radius;

	public void setradius(double r)
	{
		radius=r;
	}

	public double getarea()
	{
		return 4*3.14*radius*radius;
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Circle c=new Circle();
		Sphere sp=new Sphere();
		double r;
		System.out.print("Enter radius of circle:");
		r=s.nextDouble();
		c.setradius(r);
		System.out.println("Area of circle:"+c.getarea());
		System.out.print("Enter radius of sphere:");
		r=s.nextDouble();
		sp.setradius(r);
		System.out.println("Area of sphere:"+sp.getarea());
	}
}