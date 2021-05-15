import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		// for(int i = n; i>0; i--){
		// 	for(int j = 0; j<i; j++){
		// 		System.out.print("*");
		// 	}
		// 	System.out.println(" ");
		// }

		// using while
		int i = n;
		while(i>0){
			int j = 0;
			while(j<i){
				System.out.print("*");
				j++;
			}
			System.out.println(" ");
			i--;
		}
		

	}
}