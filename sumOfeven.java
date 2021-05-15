import java.util.*;
class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, i = 0;
		System.out.println("Enter the number till which you want the sum: ");
		n = sc.nextInt();

		System.out.println("The first "+n+" even numbers are: ");
		// while(i<n){
		// 	sum = sum+2*i;
		// 	System.out.println(2*i);
		// 	i++;
		// }
		// System.out.println("The sum is: "+sum);

		//using for loop
		for(int j= 0;j<n;j++){
			sum=sum+2*j;
			System.out.println(2*j);
		}
		System.out.println("The sum is: "+sum);
	}
}