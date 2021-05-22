import java.util.*;
class Square{
	int s;
	public void setSide(int side){
		s=side;
	}
	public int area(){
		return s*s;
	}
	public int peri(){
		return 4*s;
	}
}
class main{
	public static void main(String [] args){
		Square s = new Square();
		s.setSide(5);
		System.out.println("The area is:"+ s.area());
		System.out.println("The perimeter is:"+s.peri());
	}
}