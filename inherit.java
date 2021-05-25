class circle{
	double radius;
	circle(int r){
		this.radius=r;
		System.out.println("I am circle constructor.");
	}

	void get(){
		System.out.println("I am a circle.");
	}

	public double area(){
		return Math.PI*radius*radius;
	}
}

class cylinder extends circle{
	double height;
	cylinder(int r,int h){
		super(r);
		this.height=h;
		System.out.println("I am cylinder constructor.");
		
	}

	void gett(){
		System.out.println("I am cylinder from circle.");
	}

	public double volume(){
		return Math.PI*this.radius*this.radius*this.height;
	}
}

class main{
	public static void main(String [] args){
		cylinder c = new cylinder(3,4);
		//c.get();
		//c.gett();
		System.out.println("The area of circle is:" + c.area());
		System.out.println("The vol of cylinder is: " + c.volume());
	}
}