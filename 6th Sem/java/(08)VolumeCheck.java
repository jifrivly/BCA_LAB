import java.util.Scanner;

public class VolumeCheck
{
	public static void Volume(double s)
	{
		System.out.println("Volume of the cube" +(s*s*s));
	}

	public static void Volume(double r,double h)
	{
		System.out.println("Volume of the cylinder" +(3.14*r*r*h));
	}

	public static void Volume(double l,double b,double h)
	{
		System.out.println("Volume of the rectangle" +(l*b*h));
	}



	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		double side,height,radius,length,breadth;

		System.out.print("Enter side of the cube : ");
		side = s.nextDouble();
		Volume(side);

		System.out.println("Enter radius and height of cylinder : ");
		radius = s.nextDouble();
		height = s.nextDouble();
		Volume(radius, height);


		System.out.println("Enter length breadth and height of rectangular box : ");
		length = s.nextDouble();
		breadth = s.nextDouble();
		height = s.nextDouble();
		Volume(length, breadth, height);

	}
}