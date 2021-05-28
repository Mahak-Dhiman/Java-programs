class Monkey{
	void jump(){
		System.out.println("Jumping.");
	}
	void bite(){
		System.out.println("Biting.");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal{
	void speak(){
		System.out.println("Speaking.");
	}

	public void eat(){
		System.out.println("Eating.");
	}

	public void sleep(){
		System.out.println("Sleeping.");
	}
}
class main{
	public static void main(String[] args){
		Human h = new Human();
		h.sleep();
		h.eat();
		h.speak();
		h.bite();
		h.jump();
	}
}