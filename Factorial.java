//program to print factorial of a number
import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n; int x=1;
int f= 1;
System.out.println("Enter the number to know it's factorial");
n=sc.nextInt();
while(x<=n)
{ 
f=f*x;
x++;
}
System.out.println("The factorial of number n = "+n+" is "+f);
}
}
