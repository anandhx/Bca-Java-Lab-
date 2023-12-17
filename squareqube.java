import java.util.*;
import java.io.*;

class cube
{
protected double value;
public cube(double value)
{
this.value = value;

}

public double getvalue()
{
return value;
}
}

class squarecube extends cube
{
public double calculatesquare( double value){
super(value);
}

public double calculatecube( double vaue){
return value * value*value;
}
}

public class Maincube 
{
public static void main(string args[])
{
double number = 5.0;
sqarecube s = new squarecube(number);
calculatesquare c = new calculatesquare(number);
double square = s.calculatesquare();
double cube = c.calculatecube();
System.out.println(cube);
System.out.println(square);
