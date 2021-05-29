abstract class abc
{
	abstract void display();
	void print(){};
	static void run(){};
}
class test extends abc
{
	void display()
	{
		System.out.println("hi");
	}
	void print()
	{
		System.out.println("class");
	}
	public static void main(String arg[])
	{
		test ob=new test();
		ob.print();
		ob.display();
	}
}