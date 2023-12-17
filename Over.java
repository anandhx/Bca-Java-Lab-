import java.util.*;
import java.io.*;

class Over
{
int a,b;
int c;
int Over(int x, int y)
{

a=x;
b=y;
return (a+b);
}

int Over(int x, int y,int z)
{
a=x;
b=y;
c=z;
return (a+b+z);
}

public static void main(String args[])
{
Over a1 = new Over();
System.out.println(a1.Over(10,20));
System.out.println(a1.Over(10,20,50));
}
}

