import java.util.*;
class a
{
	public static void main(String arg[])
	{
		String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		System.out.println("the entered string is :"+s);
		  	System.out.println(s.replaceAll("[AaEeIiOoUu]",""));
		  	System.out.println(s.replaceAll("[0123456789]",""));
		  	System.out.println(s.toLowerCase());

		  	
	}
}