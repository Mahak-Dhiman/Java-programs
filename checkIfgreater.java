import java.util.*;
class main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a;
		int num = 10;
		System.out.println("Enter the number: ");
		a = sc.nextInt();
		if(num==a){
			System.out.println("It is equal to the default number. ");
		}
		else if (num>a){
			System.out.println("Default is greater than entered.");
		}
		else if(num<a){
			System.out.println("Entered number is greater than default.");
		}
		else{
			System.out.println("Invalid! ");
		}

	}
}