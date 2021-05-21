import java.util.*;
class main{
	static int sum1(int...ar){
		int sum=0;
		for(int  e: ar){
			sum=sum+e;
		} 
		return sum;
	}
	public static void main(String []  args){
		//Scanner sc = new Scanner(System.in);
		
		int k = sum1(12,12,12);
		System.out.println(k);
	}
}