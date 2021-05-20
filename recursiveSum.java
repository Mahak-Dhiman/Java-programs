import java.util.*;
class main{
	static int sum(int n){
		if(n==1){
			return 1;
		}
		return n+sum(n-1);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int a = sum(n);
		System.out.println("Sum of first "+n+" even numbers are: "+a);
	}
}