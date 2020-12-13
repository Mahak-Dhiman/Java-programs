import java.util.*;
class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n;
		n = sc.nextInt();
		System.out.println("Enter the second number: ");
		int m;
		m = sc.nextInt();
		int add=n+m;
		int sub=n-m;
		int mul=n*m;
		int div=n/m;
		System.out.println("The additon is: "+ add);
		System.out.println("The subtraction is: "+ sub);
		System.out.println("The multiplication is: "+ mul);
		System.out.println("The division is: "+ div);
	}
}