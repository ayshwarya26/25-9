import java.util.Scanner;
class Student
{
public static void main(String args[])
{
int m1[]=new int[5];
int m2[]=new int[5];
String s[]=new String[5];
int tot[]=new int[5];
System.out.println("Enter name , m1,m2 of 5 students");
Scanner a=new Scanner(System.in); 
Scanner b=new Scanner(System.in); 
Scanner c=new Scanner(System.in); 
try
{
for(int i=0;i<6;i++)
{
s[i]=a.nextLine();
m1[i]=b.nextInt();
m2[i]=c.nextInt();
tot[i]=m1[i]+m2[i];
System.out.println("Total of"+(i+1)+"th student is"+tot[i]);
}}
catch(ArrayIndexOutOfBoundsException e)
{ 
System.out.println("array index is out of bounds");
}
catch(Exception e)
{
System.out.println("exception occured");
} 
finally
{
System.out.println("this is finally block");
}
}}
