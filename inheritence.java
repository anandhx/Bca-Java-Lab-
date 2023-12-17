import java.util.*;
import java.io.*;



class A
{
int a,b;
void accept(int x,int y)
{
a=x;
b=y;
}
}

class Sum extends A
{
int result;
void calculate()
{
result = a+b;
}
}


public class main{
public static void main(String args[])
{
Sum obj = new Sum();
 
obj.accept(10,20);
obj.calculate();
System.out.println("a");
}
}

 
