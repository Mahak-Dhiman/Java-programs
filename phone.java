import java.util.*;
class Phone{
	public void ringing(){
		System.out.println("Ringing..");
	}
	public void vibrating(){
		System.out.println("Vibrating..");
	}
}

class main{
	public static void main(String[] args){
		Phone p = new Phone();
		p.ringing();
		p.vibrating();
	}
}