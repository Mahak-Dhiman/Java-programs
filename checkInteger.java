import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter a number: ");
		boolean b = sc.hasNextInt();

		if(b){
			System.out.println("It's an integer.");
		}
		else{
			System.out.println("It's not an integer.");
		}
	}
}