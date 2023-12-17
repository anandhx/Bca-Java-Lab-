import java.util.*;
import java.io.*;

class Student
{
 int rollno;
 void accept(int x)
 {
 rollno=x;
 }
 
 void display()
 {
 System.out.println("roll no "+rollno);
 }
}
 
 
class Test extends Student {
 int mark1,mark2;
 void acceptmark(int a,int b)
 {
 mark1=a;
 mark2=b;
 }
 
 void displaymark()
 {
 System.out.println(" mark1 "+mark1);
 System.out.println(" mark2"+mark2);
 }
 
}

interface Sports 
{
int sportsmark=10;
}

class Result extends Test implements Sports
{
void find()
{
int totalmark=mark1+mark2+sportsmark;
System.out.println("Sport mark "+sportsmark);
System.out.println("total mark "+totalmark);

}

}

public class stud{
public static void main(String[] args)
{

Result std = new Result();
std.accept(10);
std.acceptmark(40,40);
std.display();
std.displaymark();
std.find();
}
}



 
 


 
 
 
