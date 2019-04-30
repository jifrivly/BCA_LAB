/*write a java program to check whether a given number is perfect, abundant or deficient */

import java.util.Scanner;

public class NumberCheck
{
	public static void main( String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,i,sum=0;
		
		System.out.print("Enter the number to check : ");
		a = s.nextInt();

		for(i=1;i<a;i++)
		{
			if(a%i==0)
				sum = sum+i;
		}
		
		if(sum==a)
			System.out.print("Number is perfect !");

		else if(sum<a)
			System.out.print("Number is deficient !");

		else
			System.out.print("Number is abundant ! ");
	
	}
}