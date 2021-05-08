import java.util.*;
class main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float a, b, c, sum, avg, cgpa;
		System.out.println("Enter the marks of 1st subject out of 100: ");
		a = sc.nextFloat();

		System.out.println("Enter the marks of 2nd subject out of 100: ");
		b = sc.nextFloat();

		System.out.println("Enter the marks of 3rd subject out of 100: ");
		c = sc.nextFloat();

		sum = a + b + c;
		avg = sum/3;
		cgpa = avg/10;
		System.out.println("The sum of three subjects is: "+sum+" and the average is: "+avg+" and cgpa is: "+cgpa);
	}
}