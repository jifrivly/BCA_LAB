import java.util.Scanner;

public class ArrayCheck{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int[] a = new int[10];
		int i,sum=0,min,max;
		float avrg;

		for(i=0; i<10; i++){
			System.out.print("Enter the number " +(i+1) +" : ");
			a[i] = s.nextInt();
		}
		min = a[0];
		max = a[0];

		for(i=0; i<10; i++){
			sum = sum+a[i];
			
			if(a[i]<min)
				min = a[i];
			if(a[i] > max)
				max = a[i];
		}

		avrg = (float) sum/10;


		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avrg);
		System.out.println("Minimum = "+min);
		System.out.println("Maximum = "+max);

	
	}
}