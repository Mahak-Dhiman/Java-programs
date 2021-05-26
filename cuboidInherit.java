class Rectangle{
	public int length, breadth, height;
	void a(){
		System.out.println("I am a rectangle.");
	}

	void set(int l, int b){
		this.length=l;
		this.breadth=b;
	}

	void  get(){
		System.out.println("The l and b of rec is: "+length+", "+breadth);
	}

	double area(){
		return length*breadth;
	}
}

class Cuboid extends Rectangle{
	void b(){
		System.out.println("I am cuboid from rectangle. ");
	}

	void sett(int l, int b, int h){
		this.length=l;
		this.breadth=b;
		this.height=h;
	}

	void gett(){
		System.out.println("The l, b, and h of cuboid is: "+length+", "+breadth+", "+height);
	}
	double volume(){
		return length*breadth*height;
	}
}

class main{
	public static void main(String[] args){
		Cuboid c = new Cuboid();
		//c.a();
		//c.b();
		c.set(3,4);
		c.get();
		System.out.println("The area of rec is: "+ c.area());
		c.sett(3,4,5);
		c.gett();
		System.out.println("The volume of cuboid is: "+ c.volume());
	}
}