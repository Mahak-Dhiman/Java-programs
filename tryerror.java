import java.util.*;
class main{
	public static void main(String[] args){
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		int i=0, index;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag && i<5){
			try{
				System.out.println("Enter the value of index: ");
				index = sc.nextInt();
				System.out.println("Value is: "+a[index]);				
				break;
			}
			catch(Exception e){
				System.out.println("Invalid");
				i++;
			}
		}
	}
}