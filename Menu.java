//menu driven program
import java.io.*;
class Menu
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int a,b,c,ch;
System.out.println("Main Menu");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Devision");
System.out.println("5. Reamainder");
System.out.println("6.Exit");
System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Enter the two number");
a= Integer.parseInt(br.readLine());
b= Integer.parseInt(br.readLine());
c=a+b;
System.out.println(c);
break;
case 2:
System.out.println("Enter the two number");
a= Integer.parseInt(br.readLine());
b= Integer.parseInt(br.readLine());
c=a-b;
System.out.println(c);
break;
case 3:
System.out.println("Enter the two number");
a= Integer.parseInt(br.readLine());
b= Integer.parseInt(br.readLine());
c=a*b;
System.out.println(c);
break;
case 4:
System.out.println("Enter the two number");
a= Integer.parseInt(br.readLine());
b= Integer.parseInt(br.readLine());
c=a/b;
System.out.println(c);
break;
case 5:
System.out.println("Enter the two number");
a= Integer.parseInt(br.readLine());
b= Integer.parseInt(br.readLine());
c=a%b;
System.out.println(c);
break;
case 6:
System.exit(0);
default :
System.out.println("Invalid Input");
}
}
}

