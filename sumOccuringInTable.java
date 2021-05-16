//sum of nos. occuring in multiplication table of 8
import java.util.*;
class main{
	public static void main(String[] args){
		int n = 8, sum=0;
		for(int i=1;i<=10;i++){
			sum=sum+(8*i);
			System.out.println(8*i);
		}
		System.out.println("The sum is: "+sum);
	}
}