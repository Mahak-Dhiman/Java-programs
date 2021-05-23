import java.util.*;
class rectangle{
	double length, breadth, area;
	public rectangle(){
		this.length=4;
		this.breadth=5;
	}
	public rectangle(int l, int b){
		this.length=l;
		this.breadth=b;
	}
	public double getLength(){
		return length;
	}

	public double getBreadth(){
		return breadth;
	}

	public double area(){
		return length*breadth;
	}
}

class main{
	public static void main(String [] args){
		rectangle r = new rectangle();
	
		System.out.println("The length is: " + r.getLength());
		System.out.println("The breadth is: " +  r.getBreadth());
		System.out.println("The area is: " + r.area());
	}
}