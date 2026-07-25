/*1)import java.util.Scanner;

public class prgs {
    static void print(int n) {
        if (n == 0)
            return;

        print(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        print(n);

        sc.close();
    }
}

output:
Enter number:
6
1
2
3
4
5
6

2)import java.util.Scanner;

public class prgs {

    static int power(int base, int exp) {
        if (exp == 0)
            return 1;

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int no = sc.nextInt();

        System.out.println("Enter exponential value: ");
        int exp = sc.nextInt();

        System.out.println("Power is: " + power(no, exp));

        sc.close();
    }
}

output:
Enter number:
5
Enter exponential value:
9
Power is: 1953125
==============================================================================

//reverse string using string
import java.util.Scanner;
public class prgs{
static void reverse(String str)
{
if(str.length()==0)
	return;
System.out.println(str.charAt(str.length()-1));
reverse(str.substring(0,str.length()-1));
}
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("Enter a String:");
String str = sc.next();
reverse(str);
}
}
output:
Enter a String:yashu
u
h
s
a
y
============================================================


import java.util.Scanner;

public class prgs {

    static int count(int no) {
        if (no == 0)
            return 0;

        return 1 + count(no / 10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int no = sc.nextInt();

        System.out.println(count(no));

        sc.close();
    }
}
output:
Enter No: 10
2
====================================================================
import java.util.Scanner;

public class prgs {

    static int sumdigit(int no) {
        if (no == 0)
            return 0;

        return (no%10) + sumdigit(no / 10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int no = sc.nextInt();

        System.out.println(sumdigit(no));

        sc.close();
    }
}
output:
PS C:\yashu> javac prgs.java
PS C:\yashu> java prgs
Enter No: 10
1
==================================================================================

import java.util.Scanner;

public class prgs {

    static int gcd(int a,int b) {
        if (b == 0)
            return a;

        return gcd(b,a %b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
	 System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println(gcd(a,b));

        sc.close();
    }
}
output:
Enter a: 12
Enter b: 8
4
===================================================================================
*/
import java.util.Scanner;

public class prgs {

    static int gcd(int a,int b) {
        if (b == 0)
            return a;

        return gcd(b,a %b);
    }
 static int lcd(int a, int b) {
        return (a * b) / gcd(a, b);
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
	 System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
	System.out.println(lcd(a,b));

        sc.close();
    }
}
