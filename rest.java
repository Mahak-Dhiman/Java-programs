import java.util.*;
class restaurant
{ 
	static int total;
	public static void main(String arg[])
	{
		int a,n,m,o,p,q,d,b,c,e,f,g,h,amount,ab,cd,ef,gh;
		System.out.println("press 1 for selecting startup");
		System.out.println("press 2 for selecting main course");
		System.out.println("press 3 for selecting dessert");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		do
		{
		switch(n)
		{
		case 1:
		System.out.println("press 10 for corn bhel");
		System.out.println("press 20 for salad");
		System.out.println("press 30 for baked potatoes");
		System.out.println("press 40 for fruits");
		m=sc.nextInt();
		switch(m)
		{
		case 10:
		System.out.println("price is rs. 60");
		System.out.println("how many do u want?");
		a=sc.nextInt();
		restaurant.total=restaurant.total+(a*60);
		System.out.println(restaurant.total);
        break;

		case 20:
		System.out.println("price is rs. 70");
		System.out.println("how many do u want?");
		b=sc.nextInt();
		amount=b*70;
		total=total+amount;
        break;

		case 30:
		System.out.println("price is rs. 80");
        System.out.println("how many do u want?");
		c=sc.nextInt();
		amount=c*80;
		total=total+amount;
		break;

		case 40:
		System.out.println("proce is rs. 90");
        System.out.println("how many do u want?");
		d=sc.nextInt();
		amount=d*90;
		total=total+amount;
		break;
}
        break;

		case 2:
		System.out.println("press 50 for dal makhani");
		System.out.println("press 60 for alu fry");
		System.out.println("press 70 for rice and rajmah");
		System.out.println("press 80 for butter naan");
		o=sc.nextInt();
		switch(o)
		{
		case 50:
		System.out.println("proce is rs. 150");
        System.out.println("how many do u want?");
		e=sc.nextInt();
		amount=e*150;
		total=total+amount;
		break;

		case 60:
		System.out.println("proce is rs. 160");
        System.out.println("how many do u want?");
		f=sc.nextInt();
		amount=f*160;
		total=total+amount;
		break;

		case 70:
		System.out.println("proce is rs. 200");
        System.out.println("how many do u want?");
		g=sc.nextInt();
		amount=g*200;
		total=total+amount;
		break;

		case 80:
		System.out.println("proce is rs. 155");
        System.out.println("how many do u want?");
		h=sc.nextInt();
		amount=h*155;
		total=total+amount;
		break;
		
}
        break;

		case 3:
		System.out.println("press 90 for gulab jamun");
		System.out.println("press 100 for ice cream");
		System.out.println("press 110 for shakes");
		System.out.println("press 120 for softdrinks");
		p=sc.nextInt();
		switch(p)
		{
		case 90:
		System.out.println("proce is rs. 30");
        System.out.println("how many do u want?");
		ab=sc.nextInt();
		amount=ab*30;
		total=total+amount;
		break;

		case 100:
		System.out.println("proce is rs. 50");
        System.out.println("how many do u want?");
		cd=sc.nextInt();
		amount=cd*50;
		total=total+amount;
		break;

		case 110:
		System.out.println("proce is rs. 70");
        System.out.println("how many do u want?");
		ef=sc.nextInt();
		amount=ef*70;
		total=total+amount;
		break;

		case 120:
		System.out.println("proce is rs. 55");
        System.out.println("how many do u want?");
		gh=sc.nextInt();
		amount=gh*55;
		total=total+amount;
		break;

}
        break;
      }
        System.out.println("do you want to continue? press 1 for yes and 0 for no.");
      q=sc.nextInt();
      
  }while(q==1);

	}
	
}