import java.util.Scanner;
import java.lang.Math;

public class TriangleCheck
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		
		double a,b,c,si,area;
		
		System.out.print("Enter 3 sides of triangle : ");
		
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if((a+b>c)&&(b+c>a)&&(a+c>b))
		{
			System.out.println("The give sides can perform a triangle");
			
			if((a==b) && (b==c))
				System.out.println("It is an equilateral triangle");

			else if(a==b||b==c||a==c)
				System.out.println("It is an isosceles triangle");

			else
				System.out.println("It is an scalene triangle");

			si = (a+b+c)/2;
			area = Math.sqrt(si*(si-a)*(si-b)*(si-c));
			
			System.out.print("Area = " +area);
		}

		else
			System.out.println("The given sides can't form triangle");
	}
}



//8,8,8
//5,5,4
//3,4,5
//8,4,12