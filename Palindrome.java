import java.util.Scanner; 
class Palindrome
{
public static void main(String[] args)
{
int x;
String a,r="";
System.out.println("enter a string");
Scanner s=new Scanner(System.in);
a=s.nextLine();
x=a.length();
for(int i=x-1;i>=0;i--)
{
r=r+(a.charAt(i));
} 
if(a.equals(r))
{
System.out.println("palindrome");
}
else
System.out.println("not palindrome");
}}
