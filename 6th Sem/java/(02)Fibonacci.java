import java.util.Scanner;

public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a=0,b=1,c,n;
		
		System.out.println("Enter the limit : ");
		n = s.nextInt();

		System.out.println("Fibonacci number upto "+n);

		if(n==0)
			System.out.print(a);
		
		else
		{
			System.out.print(a + "\t" + b + "\t");

			for(c=a+b; c<n; c=a+b)
			{
				a=b;
				b=c;
				System.out.print(c + "\t");
			}
		}
	}
}