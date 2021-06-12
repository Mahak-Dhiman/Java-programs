import java.util.*;
import java.time.*;
import java.time.format.*;
class main{
	public static void main(String [] args){
		Date d = new Date();
		//Deprecated	
		//System.out.print(d.getHours()+" : "+ d.getMinutes()+" : "+ d.getSeconds());

		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR)+" : "+ c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("H : m : s");

		String mydate = dt.format(df);
		System.out.println(mydate);
	}
}