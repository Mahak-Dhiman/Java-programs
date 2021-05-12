import java.util.*;
class main{
	public static void main(String[]args){
		//string to lowercase
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		s = sc.nextLine();
		System.out.println("The string is: "+ s);
		System.out.println("The lowercase string is: "+ s.toLowerCase());

		//replace space with underscore
		System.out.println("The altered spaces is: "+ s.replace(" ", "_"));
	}
}