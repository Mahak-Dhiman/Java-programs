import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, fac = 1;

		System.out.println("Enter the number: ");
		n = sc.nextInt();

		// for(int i = 1; i <= n ; i++){
		// 	fac = fac*i;
		// }	
		// System.out.println("The factorial is: "+fac);

		int  j = 1;
		while(j<=n){
			fac = fac*j;
			j++;
		}
		System.out.println("The factorial is: "+fac);
	}
}