class main{
	public static void main(String[] args){
		int [] a = {1,2,3,4,5,22,2,12,34,4,11};
		int min = Integer.MAX_VALUE;

		for(int e : a){
			if(e<min){
				min = e;
			}
		}
		System.out.print("The min element is: "+min);
	}
}