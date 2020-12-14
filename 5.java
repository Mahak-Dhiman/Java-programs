// to compare two numbers
import java.util.*;
class Main{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the first number: ");
		a = sc.nextInt();
		int b;
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		if(a>b)
		{
			System.out.println("The first number is greater than the second.");

		}
		else if(b>a)
		{
			System.out.println("The second number is greater than the first.");
		}
		else if(a==b)
		{
			System.out.println("The two numbers are equal.");
		}
		else
		{
			System.out.println("Invalid Input!!");
		}
	}
}