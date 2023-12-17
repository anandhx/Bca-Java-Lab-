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

class Squarecube extends cube
{
public double calculatesquare(double value)
{
super(value);
}

public double calculatecube( double value)
{
return value * value * value;
}
}

public class Maincube 
{
public static void main(String args[])
{

Squarecube s = new Squarecube(5.0);
double square = s.calculatesquare();
double cube = s.calculatecube();

System.out.println(cube);
System.out.println(square);
}
}
