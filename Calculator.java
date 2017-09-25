import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
int a,b;
char f;
System.out.println("Enter 2 nos");
Scanner s=new Scanner(System.in);
a=s.nextInt();
Scanner s1=new Scanner(System.in);
b=s1.nextInt();
System.out.println("mention the operation");
Scanner d=new Scanner(System.in);
f=d.next().charAt(0);
switch(f)
{
case '+':
{ System.out.println("addition is"+(a+b));
  break;
}
case '-':
{ System.out.println("sub is"+(a-b));
  break;
}
case '*':
{ System.out.println("mul is"+(a*b));
  break;
}
case '/':
{ System.out.println("div is"+(a/b));
  break;
}
default:
{
System.out.println("error");
}
}
}}