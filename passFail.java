import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float a, b, c, sum;
		System.out.println("Enter the marks in sub 1 out of 100: ");
		a = sc.nextFloat();

		System.out.println("Enter the marks in sub 2 out of 100: ");
		b = sc.nextFloat();

		System.out.println("Enter the marks in sub 3 out of 100: ");
		c = sc.nextFloat();

		sum = (a+b+c)/3;

		if(sum<=40f && a<=30f&& b<=30f && c<=30f){
			System.out.println("You are fail.");
		}
		else{
			System.out.println("You are pass in the subjects.");
		}
	}
}