class main{
	public static void main(String[] args){
		try{
			int a = 99/0;
		}
		catch(ArithmeticException e){
			System.out.println("HAHA!");
		}
		catch(IllegalArgumentException e){
			System.out.println("HEHE!");
		}
	}
}