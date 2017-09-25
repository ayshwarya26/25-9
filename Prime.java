import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
int a,flag=0,flag1=0;
System.out.println("enter a no.");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(int i=2;i<=a;i++)
{

if(a%i==0 && i!=a)
{flag++;
}
else 
flag1++;
}
if(flag!=0)
{
System.out.println(" not prime");
}
else
System.out.println("prime");
}}