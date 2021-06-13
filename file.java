import java.util.*;
import java.io.*;
class main{
	public static void main(String [] args){
		int n = 5;
		String table = " ";
		for(int i = 1;i<=10;i++){
			table = table + n +" X "+i+" = "+n*i;
			table = table + "\n";
		}
		try{
			FileWriter f = new FileWriter("T.txt");
			f.write(table);
			f.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}