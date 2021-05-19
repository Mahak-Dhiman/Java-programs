import java.util.*;
class main{
	public static void mul(int n){
		for (int i=1;i<=10;i++){
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int m = sc.nextInt();
		mul(m);
	}
}