abstract class Pen{
	abstract void write();
	abstract void refill();
} 
class FountainPen extends Pen{
	void write(){
		System.out.println("Writing.");
	}
	void refill(){
		System.out.println("Refilling.");
	}
	public void changeNib(){
		System.out.println("Changing nib.");
	}
}
class main{
	public static void main(String [] args){
		FountainPen p = new FountainPen();
		p.changeNib();
		p.write();
		p.refill();
	}
}