import java.util.*;
class main{
	public static void main(String[] args){
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int n, i;
		boolean b = false;
		System.out.println("Enter the number you want to check in array: ");
		n = sc.nextInt();
		
		for(i = 0; i<a.length; i++){
			if(a[i]==n){
				b = true;
				break;
			}
		}
		if(b){
			System.out.print("Element found at "+i );
		}	
		else{
			System.out.print("Element not found!");
		}
	}
}