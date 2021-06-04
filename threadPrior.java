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
			// try{
			// 	Thread.sleep(20);
			// }
			// catch(Exception e){
				
			// }
			System.out.println("welcome.");
		}
	}
}
class main{
	public static void main(String [] args){
		a aa = new a();
		//aa.setPriority(6);
		b bb = new b();
		//bb.setPriority(9);
		System.out.println(aa.getPriority());
		System.out.println(bb.getPriority());
		System.out.println(bb.getState());
		System.out.println(Thread.currentThread().getState());
		// aa.start();
		//bb.start();
	}
}