import java.util.*;
class main{
	public static void main(String[]  args){
		int [][] a = {{1,2,3},
					  {4,5,6}};

		int [][] b = {{7,8,9},
					  {10,11,12}};

		int [][] res = {{0,0,0},
					    {0,0,0}};

		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				res[i][j] = a[i][j] + b[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println("");
		}
	}
}