import java.util.*;
import java.io.*;
error code


class constructor
{
int id;
int age;


constructor(int a,int b)
{
id=a;
age=b;
}

void display()
{
System.out.print("Id is : "id+"age is: "+age);
}



public static void main (String args[])
{
constructor c1= new constructor("1","2");
c1.display();

}
}

