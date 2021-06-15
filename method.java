import java.util.*;
class patient
{
		String name;
		int age;
		long contact;
	patient( String n, int a, long c) //we can take diff variables and same as well.
	{
		name= n;
		age=a;
		phone=p;
	}
	void display()
	{
		System.out.println("the details are:name"+name);
		System.out.println("age"+age);
		System.out.println("phone"+contact);
	}
	public static void main()
	{
		int m;
		patient[] obj=new patient[m];
		for(int i=0;i<m;i++)
		{
		System.out.println("enter name:");
		Scanner sc=new Scanner(System.in);
		n=sc.next();
		System.out.println("age:");
		a=sc.nextInt();
		System.out.println("contact:");0
		c=sc.nextLong();
		obj[i]=new patient(n,a,c);

		}
		for(int i=0;i<m;i++)
		{
			obj[i].display();
		}
	}

}