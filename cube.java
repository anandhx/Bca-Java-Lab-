import java.util.*;
import java.io.*;

class A
{                                                                        
int a;
void accept(int x)
{
a=x;
System.out.println(" value stored sucess");

}
}
class Square extends A
{
int calcsquare()
{
int result;
result = a * a;
return result;
}
}

class Q extends Square
{
int calccube()
{
int result;
result = a * a * a;
return result;
}
}


public class cube{
public static void main(String[] args)
{


Q s = new Q();
s.accept(10);
System.out.println(s.calcsquare());
System.out.println(s.calccube());
}
}




