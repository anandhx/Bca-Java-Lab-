import java.util.*;
import java.io.*;

class armstrong
{
public static void main(String args[])
{

int num,n;
int sum=0;
int rem=0;
int i;
num=1;
n=num;

while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}

if(num==sum)
{
System.out.println("is armstrong");
}
else
{
System.out.println("not armstrong");
}
}
}

