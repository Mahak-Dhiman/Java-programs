import java.util.*;
class main{
	public static void main(String[] args){
		String name = new String();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name:   ");
		name = sc.nextLine();

		System.out.println("Dear "+name+" \n\tThanks a lot for the present. \n\tI really liked it!");
		System.out.println(name.indexOf("  "));

	}
}