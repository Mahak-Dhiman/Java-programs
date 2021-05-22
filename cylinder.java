import java.util.*;
class cylinder{
	double radius, height, area, volume;
	public cylinder(int h, int r){
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
		return (2*Math.PI*radius*(height+radius));
	}

	public double volume(){
		return Math.PI*radius*radius*height;
	}
}

class main{
	public static void main(String [] args){
		cylinder c = new cylinder(5,3);
		//c.setHeight(5);
		//c.setRadius(3);
		System.out.println("The height is: " + c.getHeight());
		System.out.println("The radius is: " + c.getRadius());
		System.out.println("The area is: " + c.area());
		System.out.println("The volume is: " + c.volume());
	}
}