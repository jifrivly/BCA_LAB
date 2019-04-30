import java.util.Scanner;

public class ElectricityBill
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int c_no,units;
		double amount;

		System.out.println("Enter the consumer number : ");
		c_no = s.nextInt();

		System.out.println("Enter unit consumed : ");
		units = s.nextInt();

		if(units<50)
			amount = units*1.5;

		else if(units>=50 && units<100)
			amount = units*2;

		else if(units>=100 && units<200)
			amount = units*2.8;

		else if(units>=200 && units<300)
			amount = units*3.5;

		else
			amount = units*4.5;

		
		System.out.println("Bill Amount : " +amount);

	}
}