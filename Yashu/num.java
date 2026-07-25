/*
import java.util.Scanner;
class num
{
	public static void main (String[] args)	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
		int no = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=no;i++){
		fact = fact * i;   
		}
		System.out.println("factorial value is : " + fact);

	}
}
------------------------------------------------------------------------------

import java.util.Scanner;
class num
{
	public static void main (String[] args)	 throws java.lang.Exception
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
		int no = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=no;i++){
		sum = sum + i;   
		}
		System.out.println("sum of natural numbers is : " + sum);

	}
}
---------------------------------------------------------------------------------
import java.util.Scanner;
public class num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 2;i<=num;i++)
            {
                if(num%i == 0){
                    flag = 1;
                    break;
                }else {
                    flag = 0;
                }
              
            }
            if(flag == 0)
                System.out.println("prime number");
            else
                System.out.println("not a prime number");
            
    }
}
--------------------------------------------------------------------------
// fibnoacci series

import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
int f1=0,f2=1,f3=0;
for(int i=1;i<=no;i++)
{
     f3=f1+f2;
     System.out.print(f3 + " ");
     f1=f2;
     f2=f3;
} // i++
}
}
---------------------------------------------------------------------------
import java.util.Scanner;
class num
{
	public static void main (String[] args)	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
		int no = sc.nextInt();
		int num=Math.abs(no);
		int sum = 1;
		while(no >0){
		sum = sum*(no%10);
		no=no/10;   
		}
		System.out.println("procut is : " + sum);

	}
}

----------------------------------------------------------------------------------
import java.util.Scanner;
class num
{
	public static void main (String[] args)	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
		int no = sc.nextInt();
		int sum = 0, m = 0, a = 0;
		m = no;
		while(no > 0){
		a = no % 10;
		sum = sum*(a*a*a);
		no=no/10;   
		}
		if(sum == m){
		System.out.println("Armstrong No");
		} else {
		System.out.println("Not Armstrong No");
		}

	}
}
----------------------------------------------------------------------

import java.util.Scanner;
class num
{
	public static void main (String[] args)	{
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int no = sc.nextInt();
		int sum = 0, m = 0, a = 0;
		m = no;
		String str = String.valueOf(no);
		while(no > 0){
		a = no % 10;
		sum = sum+(int)Math.pow((no%10),str.length());
		no=no/10;   
	        }
		if(sum == m){
		System.out.println("Armstrong No");
		} else {
		System.out.println("Not Armstrong No");
		}
	}
}
----------------------------------------------------------------------
// print all 3 digit and 4 digit armstrong numbers
import java.util.Scanner;
class num
{
	public static void main (String[] args)	throws java.lang.Exception{
	for(int no=100;no<10000;no++){
		int sum = 0, m = no;
		String str = String.valueOf(no);
		while(m > 0){
		int a = m % 10;
		sum +=(int)Math.pow(a,str.length());
		m/=10;   
	        }
		if(sum == no){
		System.out.println("Armstrong No :" + no);
		} 
		}
	}
}

output:
Armstrong No :153
Armstrong No :370
Armstrong No :371
Armstrong No :407
Armstrong No :1634
Armstrong No :8208
Armstrong No :9474
-----------------------------------------------------------------------------------
//perfect number
// 6= 1,2,3 = 6
// 28 = 1,2,4,7,14=28
//Sum of factor number(exclusive given number from  

import java.util.Scanner;
class num
{
	public static void main (String[] args)	throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a No: ");
	int no = sc.nextInt();
	int sum = 0;
	for(int i=1;i<no;i++){
		if(no%i == 0)
		sum = sum+i;
}
		if(sum == no){
		System.out.println("perfect No :" + no);
		} else {
		System.out.println("not perfet No :" + no);
		}
	}
}

output:
Enter a No: 6
perfect No :6
Enter a No: 34
not perfet No :34
 ----------------------------------------------------------------------------------------
// arithmetic sequence
// input : 2,4,20
//output: 6,10,14,18
----------------------------------------------------------------------------------------


import java.util.Scanner;
class num
{
	public static void main (String[] args)	throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Term: ");
	int ft = sc.nextInt();
	System.out.print("Enter common diff: ");
	int d = sc.nextInt();
	System.out.print("Enter no of Terms: ");
	int no = sc.nextInt();
	int term = 0;
	for(int i=1;i<no;i++){
		term = ft+i*d; // main logic
		System.out.print(term + " ");
		}		
	}
}
output:
Enter First Term: 2
Enter common diff: 4
Enter no of Terms: 20
6 10 14 18 22 26 30 34 38 42 46 50 54 58 62 66 70 74 78
--------------------------------------------------------------------------------------------
// Print positive and negative square number of given range
// input : 5
// output : -25 -16 -9 -4 -1 1 4 9 16 25

import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int term=0;
for(int i=no;i>=-no;i--)
{ 
if(i>0)
{ 
System.out.print(-(i*i)+ " , ");
}
else
{
System.out.print ( i*i+ " ");
}
} 
}
} 

--------------------------------------------------------------------------------------------

// triangle number

import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int n=1;
boolean flag = false;
while(true)
{
int tnum=n*(n+1)/2;  //formula
System.out.println(tnum + " ");
if(tnum == no){
flag = true;
break;
}else if(tnum>no){
break;
}
n++; // main logic
}
if(flag)
System.out.println("\n" + no+ "can form triangle");
else
System.out.println("\n" + no + "cant form triangle");
}
} 
--------------------------------------------------------------------------------

// ugly number 2 3 5
import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int m=no;
int arr[] ={2,3,5};
for(int factor:arr)
{
while(no%factor==0)
{
no = no/factor;
}
}
if(no == 1)
System.out.println(m + "is ugly number");
else
System.out.println("m + "is not ugly number");
}
}
----------------------------------------------------------------------------------------------
//padovan series
import java.util.Scanner;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int p[] =new int[no];
if(no>2)
{
p[0]=1;p[1]=1;p[2]=1;
}
for(int i=3;i<no;i++)
{
p[i]=p[i-2]+p[i-3];
}
for(int arr:p)
System.out.print(arr+" ");
}
}

----------------------------------------------------------------------------------------------

import java.util.Scanner;
class num
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int s[] =new int[no];
s[0] =0;s[1]=1;
for(int i=2;i<no;i++)
{
if(i%2==0){
s[i] = s[i/2];
System.out.println("Even:" +s[i]);
}else{
s[i]=s[(i-1)]/2+s[(i+1)/2];
System.out.println("odd: " +s[i]);
}
}
System.out.print("index  :");
for(int idx=0;idx<no;idx++)
System.out.print(idx+" ");
System.out.println();
System.out.print("Sequence :");
for(int arr:s)
System.out.print(arr + " " );
}
}

output:
Enter Nooo  : 15
Even:1
odd: 1
Even:1
odd: 1
Even:1
odd: 1
Even:1
odd: 1
Even:1
odd: 1
Even:1
odd: 1
Even:1
index  :0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
Sequence :0 1 1 1 1 1 1 1 1 1 1 1 1 1 1
-----------------------------------------------------------------------------------------------------
//15.pell number
// rules 1.first number 1
2.second number 2
3.next number = 2*p-1+p-2
	      = 2*previous number + second number

0 1 2 3 4 5 6 7 8 9 10
1 2 5 12 29


------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class num
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in); 
 
System.out.print("Enter Nooo  : "); 
int no=sc.nextInt();
int p=0;
if(no == 0){
p=0;
}
else if(no == 1)
{
p=1;
}
else{
int first =0;
int second =1;
for(int i=2;i<no;i++){
p=2*second+first;
first = second;
second = p;
}
}
System.out.print(no+"th pell no is :"+p);
}
}

output:
Enter Nooo  : 15th pell no is :80782
------------------------------------------------------------------------------------------------------------

//niven number
import java.util.Scanner;

class num
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int no=sc.nextInt();
		for(int num = 1;num<=no;num++){
		    int temp =num,sum=0;
		    while(temp>0){
		        sum = sum+temp%10;
		        temp=temp/10;
		    }
		    if(sum!=0 && num%sum==0)
		    System.out.print(num + " ");
		}

	}
}
output :
100
1 2 3 4 5 6 7 8 9 10 12 18 20 21 24 27 30 36 40 42 45 48 50 54 60 63 70 72 80 81 84 90 100
------------------------------------------------------------------------------------------------------------

//sylvester sequence
import java.util.Scanner;
class num
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int no=sc.nextInt();
		long[] terms=new long[no];
		terms[0] =2;
		System.out.print(terms[0]+" ");
		for(int i =1;i<no;i++)
		{
		long product = 1;
		for(int j =0;j<i;j++)
		{
		  product*=terms[j];  
		}
		terms[i] = product+1;
		System.out.print(terms[i]+" ");
		}
	}
}

output :
5
2 3 7 43 1807

------------------------------------------------------------------------------------------------------------

// automorphic number
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int no=sc.nextInt();
		int sq = no*no;
		if(no%10 == sq%10)
		System.out.println(no + " is automorphic no");
		else
		System.out.println(no + " is not automorphic no");
	}
}

output:
25 is automorphic no
100 is automorphic no
----------------------------------------------------------------------------------------------------------
*/
// Buzz Number

