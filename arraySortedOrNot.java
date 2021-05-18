class main{
	public static void main(String[] args){
		int [] a ={1,6,3,4,5,6};
		boolean b = true;

		for (int i= 0; i<a.length -1;i++){
			if(a[i]>a[i+1]){
				b = false;
				break;
			}
		}
		if(b){
			System.out.println("Sorted");
		}
		else{
			System.out.println("Not Sorted");
		}
	}
}