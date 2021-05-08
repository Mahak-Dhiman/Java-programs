import java.util.*;
class main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a, b, c, sum;

		System.out.println("Enter the 1st number: ");
		a = sc.nextInt();

		System.out.println("Enter the 2nd number: ");
		b = sc.nextInt();

		System.out.println("Enter the 3rd number: ");
		c = sc.nextInt();

		sum = a+b+c;
		System.out.println("The sum of numbers is: "+ sum);
	}
}