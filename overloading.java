import java.util.*;
import java.io.*;

class Over
{
int a,b;
int c;
void Over(int x, int y)
{

a=x;
b=y;
}

void Over(int x, int y,int z)
{
a=x;
b=y;
c=z;
}
void display()
{
System.out.println(a+b+c);
}
public static void main(String args[])
{
Over a = new Over(10,20);
Over a1 = new Over(10,20,30);
a1.display();
a2.display();
}
}

