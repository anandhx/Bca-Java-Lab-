import java.util.*;
import java.io.*;

class exception
{
public static void main(String[] args)
{
try{
int a=10;
int b=0;
//int result;
//result = a / b;
//System.out.println(result);
int[] number={10,2,30};
int c=number[4]/b;

}

catch(ArithmeticException e)
{
System.out.println("error occured : "+  e.getMessage());
}
catch(Exception e)
{
System.out.println("error occured : "+ e.getMessage());
}
finally{

System.out.println("final block");
}
}
}
