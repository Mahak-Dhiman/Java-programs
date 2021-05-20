import java.util.*;
class main{
	public static void pattern(int n){
		for(int i =0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
    public static void pattern1(int n){
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void pattern_rec(int n){
		if(n>0){
			pattern_rec(n-1);
			for(int i=0;i<n;i++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int m = sc.nextInt();
		//pattern(m);
		//System.out.println(" ");
		//pattern1(m);
		//System.out.println("Using recursion: ");
		//pattern_rec(m);
	}
}