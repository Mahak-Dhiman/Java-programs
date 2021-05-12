import java.util.*;
class main{
	public static void main(String[] args){
		float v, u, a, s, form;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial velocity: ");
		u = sc.nextFloat();

		System.out.println("Enter the final velocity: ");
		v = sc.nextFloat();

		System.out.println("Enter the acceleration: ");
		a = sc.nextFloat();

		System.out.println("Enter the speed: ");
		s = sc.nextFloat();

		form = ((v*v) - (u*u))/(2*a*s);
		System.out.println("The formula v^2-u^2/ 2as is: "+ form);

	}
}