import java.util.*;
class bank
{ 
static int money;
public static void main(String arg[]) 
{ 
String name;
int age,n,m;
int money1;
int money2;
do
{
System.out.println("press 1 to create new accont");
System.out.println("press 2 to deposit the money");
System.out.println("press 3 to withdraw money");
System.out.println("press 4 for balance enquiry");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
switch(n)
{
case 1:
name=sc.next();
age=sc.nextInt();
money=sc.nextInt();
System.out.println("the entered name is:"+name);
System.out.println("the entered age is:"+age);
System.out.println("the entered amount is:"+money);
break;
case 2:
money1=sc.nextInt();
money=money+money1;
break;
case 3:
money2=sc.nextInt();
money=money-money2;
break;
case 4:
if (money==0)
{
System.out.println("insuffecient balance");
}
else
{
System.out.println(money);
}
break;
}

System.out.println("do u want to continue? 1 for yes 0 for no");
m=sc.nextInt();
}
while(m==1);
}
}

