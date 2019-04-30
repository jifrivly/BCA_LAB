import java.util.Scanner;

class Digit{

	int num;
	public Digit(int n){
		num = n;
	}

	public void find(){
		int sum=0,rev = 0,rem;
		
		while(num>0)
		{
			rem = num % 10;
			sum = sum + rem;
			rev = (rev*10) +rem;

			num = num/10;
		}
		System.out.println("Sum of digits = " +sum);
		System.out.println("Reverse = " +rev);
		
	}
}



public class DigitCheck{
	public static void main( String args[]){
		int n;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number : ");
		n = s.nextInt();

		Digit d = new Digit(n);
		d.find();
	}
}