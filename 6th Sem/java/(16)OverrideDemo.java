import java.util.Scanner;
class TwoNumbers
{
	protected int a,b;
	public TwoNumbers(int x,int y)
	{
		a=x;
		b=y;
	}

	public void greatest()
	{
		if(a>b)
		{
			System.out.println(a+" is greatest");
		}
		else
		{
			System.out.println(b+" is greatest");
		}
	}
}

class ThreeNumbers extends TwoNumbers
{
	int c;

	public ThreeNumbers(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}

	public void greatest()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greatest");
			}
			else
			{
				System.out.println(c+" is greatest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is greatest");
			}
			else
			{
				System.out.println(c+" is greatest");
			}
		}
	}
}

class OverrideDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		TwoNumbers t1;
		ThreeNumbers t2;
		int a,b,c;
		System.out.println("Enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		t1=new TwoNumbers(a,b);
		t1.greatest();
		System.out.println("Enter three numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		t2=new ThreeNumbers(a,b,c);
		t2.greatest();
	}
}