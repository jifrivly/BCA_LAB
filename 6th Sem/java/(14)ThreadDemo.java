import java.util.Scanner;

class Odd extends Thread
{
	int limit;
	Odd (int l)
	{
		limit=l;
	}

	public void run()
	{
		for(int i=1;i<=limit;i++)
			if(i%2==1)
				System.out.println(i+" is odd");

	}
}

class Even extends Thread
{
	int limit;
	Even(int l)
	{
		limit=l;
	}

	public void run()
	{
		for(int i=1;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even");
			}
		}
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int limit;
		System.out.print("Enter the limit : ");
		limit=s.nextInt();
		Odd o=new Odd(limit);
		Even e=new Even(limit);
		o.start();
		e.start();
	}
}