import java.util.*; 
import java.io.IOException;

class outer
{
int n=0;
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter your Budget:");
n=sc.nextInt();
}
}


interface s
{
 void salary();    
}


class budget implements s
{
outer out=new outer();
public void salary()
{	
	int c,change,d;
	change=0;
	d=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter 1 to Increase Budget and 2 to Decrease Budget:");
    c=sc.nextInt();
    
    switch(c)
    {
    
    case 1:
    {
    System.out.println("\nEnter how much you want Increase:");
    d=sc.nextInt();
    out.n=out.n+d;
    break;
    }

    case 2:
    {
    System.out.println("\nEnter how much you want Decrease:");
    d=sc.nextInt();
    out.n=out.n-d;
    break;
    }

    }
}
}
public class CA3{
public static void main(String...ag) throws IOException,InterruptedException	 
{

  int n,p,h,d,a=0,l,e,j,c,u=0,q;
  String b;
  p=0;
  j=0;
  h=0;
  n=0;
  int i;
  String arr[]=new String[10]; 
  int arr1[]=new int[10];
  Scanner sc=new Scanner(System.in);  
  
  budget obj=new budget();
  obj.out.display();

int t=0;
while(t<2)
{

  System.out.println("\n1-Change Budget, 2-Add Expenses ,3-Delete Expenses ,4-Display ,5-exit:");
  
try{
a=sc.nextInt();
if(a>5)
{
throw new ArithmeticException("wrong choice");}}
catch(ArithmeticException err)
{
System.out.println("error"+err.getMessage());}
switch(a)
{

case 1:
   {
    obj.salary();
    break;
   }
 
case 2:
   {
   System.out.println("\nHow many items?");
   h=sc.nextInt();

   for(i=0;i<h;i++)
    {
	System.out.println("\nEnter Item(name):");
	b=sc.next();
	arr[i]=b;
    
	System.out.println("Enter Price:");
	e=sc.nextInt();
	arr1[i]=e;
	obj.out.n=obj.out.n-e;
    }

   try
    { 
   	if(obj.out.n<=0)
    { 
    	throw new ArithmeticException("WARNING:Exteded budget");
    }
    }
    catch(ArithmeticException bud)
	{
		System.out.println("Error!"+bud.getMessage());
	}
    break;
   }
case 3:
  {
   System.out.println("\nWhich Item you want to delete(Starts from 0):\n");
 
   for(i=0;i<h;i++)
   {
   System.out.println(arr[i]+" "+arr1[i]+"\n");
   }
  
   int choice=0;
   q=sc.nextInt();

   for(i=0;i<h;i++)
   {
   arr[q]=arr[q+1];
   arr1[q]=arr1[q+1];
   q=q+1;
   }
  
   h=h-1;
   obj.out.n=obj.out.n+arr1[choice];
  break;
  }

 case 4:
   {
   System.out.println("What You want to print. 1-list, 2-Savings");
   l=sc.nextInt();
   switch(l)
   {

   case 1:
   {
   for(i=0;i<=h;i++)
   {
   System.out.println(arr[i]+" "+arr1[i]);
   }
   break;
   }

   case 2:
   {
   System.out.println("Your Savings is"+" "+obj.out.n);
   break;
   }

   }

}

case 5:
{
	t=t+1;
	break;
}



}

System.out.println("\nDo you want to Go back to home Screen? 1 for yes,2 for no:");
try{
u=sc.nextInt();

if(u>2)
{
	throw new ArithmeticException("wrong choice");}
}

catch (ArithmeticException qrr)
{
System.out.println(" error"+qrr.getMessage());
}
 
  switch(u)
   {
	
	case 1:
	{
    System.out.println("\nokay");
	break;
	}

	case 2:
	{
	t=t+2;
	break;
 	}
   
   }

}
}

}

