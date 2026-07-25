Thread
-------------------
MS Word - An Application
Thread is a single unit
-----------------------------
Multithreading - Main feature of java
A program contain more than one thread , it called multithreading.

Multitasking
Different applications running at the same time , its called multitasking
------------------------
Thread Life cycle
1. New born
2. Runnable
3. Running
4. Blocked
5. Kill
-----------------
class A extends Thread  
{
public void run()  
{
for(int i=1;i<=10;i++)
{
if(i==3)
Thread.currentThread().interrupt(); // alternate of stop method in new java versions
//stop(); // stopping the thread
System.out.print("i is : " + i + ", ");
}
System.out.println("Exit From Thread A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=10;j++)
{
if(j==3)
Thread.yield(); // moving to blocked state
System.out.print("j is : " + j + ", ");
}
System.out.println("Exit From Thread B");
}
}
class C extends Thread 
{
public void run() 
{
try
{
for(int k=1;k<=10;k++)
{
Thread.sleep(2000); 
System.out.print("k is : " + k +", ");
}
System.out.println("Exit From Thread C");
}
catch(Exception e)
{ }
}}
class Main
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
}
}
================================
Main also one of the Thread 

There are some priority of thread:
1. Minimum- 1
2. Normal  - 5
3. Maximum - 10
-----------------------------------------------
class Main
{
public static void main(String args[])
{
 Thread  t=Thread.currentThread();
 System.out.println("Current Thread Name : " + t.getName());
 System.out.println(t);

t.setName("Sudheer, Dillip");
t.setPriority(7);
 System.out.println(t.getName());
 System.out.println(t);

}
}
==========================
class Reporter{
synchronized void printReporter(int n,String s){  
{
     for(int i=1;i<=5;i++){  
      System.out.println(s+ " - " + i);  
      try{  
       Thread.sleep(400);  
      }catch(Exception e){System.out.println(e);}  
     }  
   } } }   
class News extends Thread{  
Reporter t;  
public News(Reporter t)
{  
this.t=t;  
}  
public void run()
{  
t.printReporter(5, "News");  
}    
}  
class Publish extends Thread{  
Reporter t;  
public Publish(Reporter t){  
this.t=t;  
}  
public void run(){  
t.printReporter(5,"Publish");  
}  
}  
  
public class Main
{  
public static void main(String args[])
{  
Reporter obj = new Reporter();  //only one object  
News t1=new News(obj);  
Publish t2=new Publish(obj);  
t1.start();  
t2.start();  
}  
}  
=================================
public class ThreadStates
{
    public static void main(String[] args)
    {
        Thread.State[] states = Thread.State.values();
 
        for (Thread.State state : states)
        {
            System.out.println(state);
        }
    }
}
==================================
/*We can create threads in two ways : one by using the extended Thread class and another by implementing the Runnable interface. The Runnable interface declares the run() method that is required for implementing threads in our programs.*/
---------------------------
import java.io.*;
class X implements Runnable //Interface
{
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println("\tThread X : "+i);
	}
	System.out.println("End of Thread X");
}	}
class Thread6
{
	public static void main(String args[])
	{
	X run1=new X(); //Object
	Thread threadX=new Thread(run1);
	threadX.start();
	System.out.println("End of Main Thread");
	}
}
================================
// resume and suspend methods

class NewA extends Thread   
{
	public void run()   
	 {                  		
	  try  
	  {
	   for(int i=0; i<5; i++)   
	   {
	     Thread.sleep(500);
	     System.out.println( this.getName() + ":  " + i );
	   }
	  }
	  catch(InterruptedException e)   
	  { 
	    e.printStackTrace();  
	  }
	 }
}
class NewB extends Thread   
{
	public void run()   
	 {                  		
	  try  
	  {
	   for(int i=0; i<5; i++)   
	   {
	     Thread.sleep(500);
	     System.out.println( this.getName() + ":  " + i );
	   }
	  }
	  catch(InterruptedException e)   
	  { 
	    e.printStackTrace();  
	  }
	 }
}
public class Test5 
{
 public static void main(String args[])
 {
	 NewA srd1 = new NewA();   
	 NewB srd2 = new NewB();   
   srd1.setName("First");
   srd2.setName("Second");
   srd1.start();      
   srd2.start();
   try   
   {
     Thread.sleep( 1000 );
     srd1.suspend();
     System.out.println("Suspending thread First");
     Thread.sleep(1000);
     srd2.suspend();
     System.out.println("Suspending thread Second");
     Thread.sleep(1000);
     System.out.println("Resuming thread First");
     Thread.sleep( 1000 );
     
     srd1.resume();
     srd2.resume();
     System.out.println("Resuming thread Second");
   }
   catch(InterruptedException e)   
   {  
     e.printStackTrace();   
   }
 } 
 } 

/*
Sometimes, the inactive time or blocked time may not be known to the programmer earlier; to come to the task here comes suspend() method. The suspended thread will be in blocked state until resume() method is called on it. These methods are deprecated, as when not used with precautions, the thread locks, if held, are kept in inconsistent state or may lead to deadlocks.
*/
==============================
// Thread join method

class A extends Thread {   
  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("A");
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println( " interrupted.");
    }
    System.out.println(" exiting.");
  }
}
class B extends Thread {   
	  public void run() {
	    try {
	      for (int i = 0; i < 5; i++) {
	        System.out.println("B");
	        Thread.sleep(1000);
	      }
	    } catch (InterruptedException e) {
	      System.out.println( " interrupted.");
	    }
	    System.out.println(" exiting.");
	  }
	}
class C extends Thread {   
	  public void run() {
	    try {
	      for (int i = 0; i < 5; i++) {
	        System.out.println("C");
	        Thread.sleep(1000);
	      }
	    } catch (InterruptedException e) {
	      System.out.println( " interrupted.");
	    }
	    System.out.println(" exiting.");
	  }
	}

class ThreadJoin {
  public static void main(String args[]) {
    A ob1 = new A( );
    B ob2 = new B( );
    C ob3 = new C( );
ob1.start();
ob2.start();
ob3.start();
    System.out.println("Thread One is alive: " + ob1 .isAlive());
    System.out.println("Thread Two is alive: " + ob2 .isAlive());
    System.out.println("Thread Three is alive: " + ob3 .isAlive());
    try {
      System.out.println("Waiting for threads to finish.");
      ob1 .join();
      ob2 .join();
      ob3 .join();
    } catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
    }

    System.out.println("Thread One is alive: " + ob1 .isAlive());
    System.out.println("Thread Two is alive: " + ob2 .isAlive());
    System.out.println("Thread Three is alive: " + ob3 .isAlive());

    System.out.println("Main thread exiting.");
  }
}
===================================
Program 3 – Thread Synchronization (Presidency)
import java.util.Scanner;

public class ThreadSynchronization {
    static int temp = 100;
    static Scanner sc = new Scanner(System.in);

    synchronized static void display(int id, String name) {
        System.out.println("Hi " + name + ", Your ID is " + id);
        try { Thread.sleep(1000); } catch (Exception e) {}
        System.out.println("Welcome to Presidency University");
    }

    static Thread createParticipant() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        int id = ++temp;
        return new Thread(() -> display(id, name));
    }

    public static void main(String[] args) {
        Thread p1 = createParticipant(), p2 = createParticipant(), p3 = createParticipant();
        p1.start(); p2.start(); p3.start();
    }
}
==============================

