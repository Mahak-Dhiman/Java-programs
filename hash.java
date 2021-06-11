import java.util.*;
class main{
	public static void main(String [] args){
		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);		
		h.add(2);

		System.out.println(h);
	}
}