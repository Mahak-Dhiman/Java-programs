import java.util.*;
class sphere{
	double radius, height, area, volume;
	public sphere(int h, int r){
		this.height=h;
		this.radius=r;
	}
	// or
	// public void setHeight(int h){
	// 	this.height = h;
	// }

	// public void setRadius(int r){
	// 	this.radius = r;
	// }

	public double getHeight(){
		return height;
	}

	public double getRadius(){
		return radius;
	}

	public double area(){
		return (4*Math.PI*radius*radius);
	}

	public double volume(){
		return (4/3)*Math.PI*radius*radius*radius;
	}
}

class main{
	public static void main(String [] args){
		sphere s = new sphere(5,3);
		//s.setHeight(5);
		//s.setRadius(3);
		System.out.println("The height is: " + s.getHeight());
		System.out.println("The radius is: " + s.getRadius());
		System.out.println("The area is: " + s.area());
		System.out.println("The volume is: " + s.volume());
	}
}