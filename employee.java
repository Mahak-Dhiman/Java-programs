import java.util.*;
class Employee{
	int salary=50000;
	String name;

	public int getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
}

class main{
	public static void main(String[] args){
		Employee e = new Employee();
		System.out.println(e.getSalary());
		e.setName("Mahak");
		System.out.println(e.getName());
	}
}