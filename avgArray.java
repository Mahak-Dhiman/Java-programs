import java.util.*;
class main{
	public static void main(String [] args){
		float [] m = {78f, 55f, 79f, 98f, 67f};
		float avg = 0, sum = 0 ;
		for(float e:m){
			sum = sum + e;
		}
		avg = sum/m.length;
		System.out.print("The avg marks are: "+avg);
	}
}