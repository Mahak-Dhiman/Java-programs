import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		String s = new String();

		System.out.println("Enter website: ");
		s = sc.nextLine();

		if(s.endsWith(".org")){
			System.out.println("Organizational website.");
		}
		else if (s.endsWith(".com")){
			System.out.println("Commercial website.");
		}
		else if (s.endsWith(".in")){
			System.out.println("Indian website.");
		}
		else{
			System.out.println("Invalid.");
		}

	}
}