import java.util.Scanner;

class ExceptionDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,choice;
		try
		{
			do
			{
				System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit\nSelect any option:");
				choice=s.nextInt();
				
				System.out.println("Enter two numbers");
				a=s.nextInt();
				b=s.nextInt();

				switch(choice)
				{
					case 1:
						System.out.println("Sum="+(a+b));
						break;

					case 2:System.out.println("Difference="+(a-b));
						break;

					case 3:System.out.println("Product="+(a*b));
						break;

					case 4:if(b==0)
						{
							throw new ArithmeticException("DivisionByZero");
						}
						else
						{
							System.out.println("Quotient="+(a/b));
						}
						break;

					default:break;
				}
			}while(choice!=5);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString()+" not possible");
		}
	}
}