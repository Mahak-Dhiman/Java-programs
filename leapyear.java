import java.util.*;
class main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int year;

		System.out.println("Enter the year you want to check if its leap or not: ");
		year = sc.nextInt();

		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.print("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else{
				System.out.println("YES");
		    }
		}
		else{
			System.out.println("NO");
		}
	}
}