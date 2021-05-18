import java.util.*;
class main{
	public static void main(String [] args){
		int [] a = {1,2,3,4,5,6,7};
		int l = a.length;
		int n = Math.floorDiv(l,2);
		for(int i =0; i<n; i++){
			int temp = a[i]; //swapping
			a[i] = a[l-1-i];
			a[l-1-i] = temp;
		}
		for(int e:a){
			System.out.println(e);
		}
	}
}