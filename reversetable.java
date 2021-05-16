import java.util.*;
class main{
	public static void main(String[ ] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n = sc.nextInt();

		for(int i = 10; i >= 1; i--){
			System.out.println(n+" X "+i+" = "+ n*i);
		}
	}
}