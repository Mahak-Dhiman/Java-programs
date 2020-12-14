//area and perimeter of circle
import java.util.*;
class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float radius;
		System.out.println("Enter the radius in cm: ");
		radius = sc.nextFloat();
		float area;
		area = 3.14f*radius*radius;
		System.out.println("The Area is: " + area + " cm^2.");
		float perimeter;
		perimeter = 2*3.14f*radius;
		System.out.println("The perimeter is: "+ perimeter + "cm.");
	}
}