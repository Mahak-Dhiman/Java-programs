import java.util.*;
class main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float km, miles;
		System.out.println("Enter the number you want to convert to miles: ");
		km = sc.nextFloat();

		miles = km*0.62f;
		System.out.print("The miles is: "+ miles);
	}
}