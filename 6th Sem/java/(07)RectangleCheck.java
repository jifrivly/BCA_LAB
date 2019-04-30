import java.util.Scanner;

class Rectangle{
	double length, breadth;

	public void read(){
		Scanner s = new Scanner(System.in);
		length = s.nextDouble();
		breadth = s.nextDouble();
	}
	
	public double getArea(){
		return (length*breadth);
	}
}



public class RectangleCheck{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		System.out.println("Enter length and breadth of Rectangle 1 : ");
		r1.read();

		System.out.println("Enter length and breadth of Rectangle 2 : ");
		r2.read();


		if(r1.getArea() == r2.getArea())
			System.out.println("Area of both rectangles are equal! ");

		else{
			if(r1.getArea() < r2.getArea())
				System.out.println("Area of Rectangle 1 is smaller than the area Rectangle 2! ");

			else
				System.out.println("Area of Rectangle 1 is greater than the area Rectangle 2! ");

		}

	}
}		