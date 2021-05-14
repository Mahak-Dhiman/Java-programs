import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float income, tax;

		System.out.println("Enter the income in lacs: ");
		income = sc.nextFloat();

		if(income<2.5f){
			System.out.println("No tax to be paid.");
		}
		else if(income>=2.5f && income<5.0f){
			tax=  0.05f*(income);
			System.out.println("Pay 5% tax: "+tax);
		}
		else if(income>=5.0f && income<10.0f){
			tax=  0.20f*(income);
			System.out.println("Pay 20% tax: "+tax);
		}
		else if(income>=10.0f){
			tax=  0.30f*(income);
			System.out.println("Pay 30% tax: "+tax);
		}
		else{
			System.out.println("Invalid entry.");
		}
	}
}