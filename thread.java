class a extends Thread{
	public void run(){
		while(true){
			System.out.println("Good morning.");
		}
	}
}

class b extends Thread{
	public void run(){
		while(true){
			try{
				Thread.sleep(20);
			}
			catch(Exception e){
				
			}
			System.out.println("welcome.");
		}
	}
}
class main{
	public static void main(String [] args){
		a aa = new a();
		b bb = new b();
		aa.start();
		bb.start();
	}
}