import java.util.Scanner;

class Complex{
	double real,img;
	public Complex(double r, double l){
		real = r;
		img = l;
	}

	public void add(Complex c){
		real = real + c.real;
		img = img + c.img;
		System.out.println("Sum = " + real + "+" + img + "i");
	}
}

public class ComplexCheck{

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		double r,i;

		System.out.println("Enter the real and imaginary part of the Complex number 1 : ");
		r = s.nextDouble();
		i = s.nextDouble();
		Complex c1 = new Complex(r,i);


		System.out.println("Enter the real and imaginary part of the Complex number 2 : ");
		r = s.nextDouble();
		i = s.nextDouble();
		Complex c2 = new Complex(r,i);

		c1.add(c2);
	}
}