class main{
	public static void main(String[] args){
		int [] a = {1,2,3,4,5,22,2,12,34,4,11};
		int max = 0;

		for(int e : a){
			if(e>max){
				max = e;
			}
		}
		System.out.print("The max element is: "+max);
	}
}