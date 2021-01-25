//Fibonacci Series
import java.util.*;
class fibonacci
{
	public static void main(String []args)
	{
		int i = 0;
		int j = 1;
		int k;
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the the number upto which you want t print the fibanacci series: ");
		n = sc.nextInt();
		System.out.println(" "+ i +"\n "+j);
		for(int a = 2; a < n; a++)
		{
			k = i + j;
			System.out.println(" "+k); 
			i = j;
			j = k;
		}
	}
}