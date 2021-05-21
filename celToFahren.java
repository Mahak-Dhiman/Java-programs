// (0°C × 9/5) + 32 = 32°F
import java.util.*;
class main{
	static float temp(float c){
	    float f = c*1.8f+32f;
		return f;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in celsius: " );
		float c = sc.nextFloat();
		
		float fa = temp(c);
		System.out.println("Fahrenheit temp is: "+fa);
	} 
}