abstract class Telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartTelephone extends Telephone{
	public void ring(){
		System.out.println("Ringing.");
	}

	public void lift(){
		System.out.println("Lifting.");
	}

	public void disconnect(){
		System.out.println("Disconnected.");
	}

	public void basic(){
		System.out.println("Basic.");
	}
}
class main{
	public static void main(String[]args){
		SmartTelephone s = new SmartTelephone();
		s.ring();
		s.lift();
		s.disconnect();
		s.basic();
	}
}