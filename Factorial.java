import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
int num,a=1;
System.out.println("Enter any number");
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(int i=1;i<=num;i++)
{
a=a*i;
}
System.out.println("The factorial is"+a);
}} 
