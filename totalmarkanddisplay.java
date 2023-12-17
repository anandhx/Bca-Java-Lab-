import java.util.*;
import java.io.*;

class totalmarkanddisplay
{
public static void main (String args[])
{
int mark1,mark2,mark3;


Scanner sc = new Scanner(System.in);
System.out.print("enter mark1 ");
mark1= sc.nextInt();
System.out.print("");
System.out.print("enter mark2 ");
mark2= sc.nextInt();
System.out.print("");
System.out.print("enter mark3 ");
mark3= sc.nextInt();
int result=mark1+mark2+mark3;

System.out.print("Total mark is  "+result);
}
}

