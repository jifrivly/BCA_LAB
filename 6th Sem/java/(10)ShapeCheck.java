import java.util.Scanner;
class Shape{
	double length,breadth;
	public Shape(double l){
		length = l;
		breadth = l;
	}
	
	public Shape(double l,double b){
		length = l;
		breadth = b;
	}

	public double getArea(){
		return length * breadth;
	}
}

public class ShapeCheck{

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		double l,b;

		System.out.print("Enter length of the square : ");
		l = s.nextDouble();
		Shape s1 = new Shape(l);
		System.out.println("Area of square = " + s1.getArea());

		System.out.print("Enter length and breadth of the rectangle : ");
		l = s.nextDouble();
		b = s.nextDouble();
		Shape s2 = new Shape(l,b);
		System.out.println("Area of rectangle = " + s2.getArea());
	}

}