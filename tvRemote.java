interface TVRemote{
	void play();
	void pause();
}
interface SmartTVRemote extends TVRemote{
	void netflix();
	void record();
}
class TV implements TVRemote{
	public void play(){
		System.out.println("Playing.");
	}
	public void pause(){
		System.out.println("Pausing.");
	}
	public void netflix(){
		System.out.println("Opening netflix.");
	}
	public void record(){
		System.out.println("Recording.");
	}
}
class main{
	public static void main(String[] args){
		TV t= new TV();
		t.play();
		t.pause();
		t.netflix();
		t.record();
	}
}