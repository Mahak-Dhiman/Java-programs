import java.util.*;
class main{
	public static void main(String[]args){
		
		String name, name1 = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		name1 = name.replace(" ", "_");
		System.out.println("Dear "+name1+" Thanks a lot for the present. I really liked it!");

	}
}