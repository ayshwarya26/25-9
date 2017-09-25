import java.util.Scanner;
class Swapn
{
public static void main(String[] args)
{
int a,b;
System.out.println("enter 2 values");
Scanner a1=new Scanner(System.in);
a=a1.nextInt();
Scanner a2=new Scanner(System.in);
b=a2.nextInt();
System.out.println("before swap:"+a+"  "+b);

a=a-b;
b=a+b;
a=b-a;
System.out.println("after swap:"+a+"  "+b);
}}