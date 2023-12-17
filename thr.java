import java.util.*;
import java.io.*;

public class thr
{
public static void main(String args[])
{
 Myrunnable myrunnable = new Myrunnable();
 
 Thread thread=new Thread(myrunnable);
 thread.start();
 }
 }
 
class Myrunnable implements Runnable
{
  
 public void run()
 {
 System.out.println("thread is running");
 }
 }

 
