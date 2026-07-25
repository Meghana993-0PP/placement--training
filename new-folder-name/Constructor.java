/*public class constructor {
    public static void main(String args[]) {

        String ename = "yashu";
        String company = "TCS";
        String dept = "full stack";
        String email = "yashu@gmail.com";
        String password = "yashu123";
        String filename = "yashu.pdf";
        String msg = "welcome";
        String Str1 = "  yashu  ";

        // length
        System.out.println("Length of name: " + ename.length());

        // trim
        System.out.println("Before trim: " + Str1 +
                " - After trim: " + Str1.trim());

        // toUpperCase
        System.out.println("Name in capital: " + ename.toUpperCase());

        // toLowerCase
        System.out.println("Dept in small: " + dept.toLowerCase());

        // charAt
        System.out.println("Character: " + ename.charAt(3));

        // substring
        System.out.println("Substring 1: " + ename.substring(3));
        System.out.println("Substring 2: " + ename.substring(1, 4));

        // contains
        System.out.println("Contains: " + msg.contains("java"));

        // startsWith
        System.out.println("Department starts with: " + dept.startsWith("fu"));

        // endsWith
        System.out.println("Department ends with: " + dept.endsWith("ck"));

        // compareTo
        System.out.println("Compare To: " +
                "narendra".compareTo("surendra"));

        // compareToIgnoreCase
        System.out.println("Compare To: " +
                "NARENDRA".compareToIgnoreCase("narendra"));

        // replace
        System.out.println("Original: " + email +
                " - After replace: " + email.replace("yashu", "amazon"));

        // indexOf
        System.out.println("Index Of: " + email.indexOf("@"));

        // lastIndexOf
        System.out.println("Last index of: " + ename.lastIndexOf("a"));

        // concat
        System.out.println("Concat: " + ename.concat("-" + dept));

        // split
        String arr[] = msg.split(" ");

        for (String s : arr) {
            System.out.println(s);
        }

        // join
        System.out.println(
                String.join("-", "KLU", "Computer Science", "Batch 2")
        );

        // toCharArray
        char c[] = company.toCharArray();

        for (char c1 : c) {
            System.out.print(c1 + "-");
        }

        System.out.println();

        // repeat
        System.out.println("Repeat: " + "KLU".repeat(5));

        // StringBuilder
        StringBuilder sb1 = new StringBuilder("java is easy");
        System.out.println("Original StringBuilder: " + sb1);

        // insert
        sb1.insert(5, "Programming ");
        System.out.println("After insert: " + sb1);

        // remove
        sb1.deleteCharAt(7);
        System.out.println("After remove: " + sb1);

        // append
        sb1.append(" James Gosling").append(" 1995");
        System.out.println("After append: " + sb1);

        // reverse
        sb1.reverse();
        System.out.println("After reverse: " + sb1);
    }
}

==================================================
public class Constructor{
public static void main(String args[]){
System.out.println(args[2].charAt(2));
}
}


public class constructor {
    public static void main(String args[]) {

        String uname = "klu";
        String password = "123";
	

        System.out.println("login succcessful");
	else
        System.out.println("invalid user and password");
    }
}

=================================================================
public class constructor {
    public static void main(String args[]) {

        String s1 = new String("klu");
	String s2 = new String("klu");
        String s3 = s1;
	

        System.out.println(s1==s2);
	 System.out.println(s1==s3);
	 System.out.println(s1.equals(s2));
    }
}
output:
false
true
true
=================================================================================

// Random otp
import java.util.Random;
public class Constructor{
    public static void main(String args[]){
        Random r = new Random();
        int otp=r.nextInt(9000)+1000;
        System.out.print("Otp is:" +otp);
    }
}
output:
Otp is:1541
PS C:\yashu> java Constructor
Otp is:1584
PS C:\yashu> java Constructor
Otp is:4563
PS C:\yashu>
==================================================================================

// password generation
import java.util.Random;
public class Constructor{
    public static void main(String args[]){
        Random r = new Random();
	String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        String password ="";
	for(int i=0;i<=6;i++){
	password += str1.charAt(r.nextInt(str1.length()));
	}
	System.out.println("new passwors is: " +password);

    }
}
output:
PS C:\yashu> java Constructor
new passwors is: ij5Z0Sl
PS C:\yashu> java Constructor
new passwors is: &9PxSBy
PS C:\yashu> java Constructor
new passwors is: jL*edKh
PS C:\yashu>

===============================================================================================

import java.util.*;

class Constructor {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String txt = sc.nextLine();

        String word[] = txt.split(" ");

        // REVERSE ALL CHARACTERS
        System.out.println("Reverse All Characters:");
        for (int i = txt.length() - 1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }
        System.out.println();

        // REVERSE WORD BY WORD
        System.out.println("Reverse Word Order:");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }
        System.out.println();

        // REVERSE ONLY EACH WORD
        System.out.println("Reverse Each Word:");
        for (int i = 0; i < word.length; i++) {
            for (int j = word[i].length() - 1; j >= 0; j--) {
                System.out.print(word[i].charAt(j));
            }
            System.out.print(" ");
        }

        sc.close();
    }
}
output:
Enter a Sentence: aaku good girl
Reverse All Characters:
lrig doog ukaa
Reverse Word Order:
girl good aaku 
Reverse Each Word:
ukaa doog lrig 
====================================================================================

import java.util.*;

class Constructor {
    public static void main(String args[]) {

        System.out.println('A' + 32 + "-" + (char)('A' + 32));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String txt = sc.nextLine();

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ')
                System.out.print(" ");
            else
                System.out.print((char)(txt.charAt(i) + 32));
        }

        sc.close();
    }
}
output:
97-a
Enter a Sentence: MOULU WASTE
moulu waste
================================================================================

import java.util.*;

class Constructor {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String txt = sc.nextLine();

        String word[] = txt.split(" ");

for (int i = 0; i < word.length; i++) {
    System.out.print(Character.toUpperCase(word[i].charAt(0)));
    for (int j = 1; j < word.length; j++) {
        System.out.print(word[i].charAt(j));
    }
    System.out.print(" ");
}
}
}
    
output:
Enter a Sentence: hello yashu welcome
Hel Yas Wel 
=============================================================================
import java.util.*;
import java.io.Console;
class Constructor {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String username[] = new String[n];
        String password[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Username: ");
            username[i] = sc.nextLine();

            System.out.print("Enter Password: ");
             password[i]= sc.nextLine();
        }
    }
}
*/
import java.io.Console;
import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("\t\t----------- Sign Up ----------- ");
	System.out.print("Enter No : ");
	int no=sc.nextInt();
	String uname[]=new String[no];
	String pass[]=new String[no];
	Console console = System.console();
 	for(int i=0;i<no;i++)
	{
	System.out.print("Enter Username " + (i+1) + ":");
	uname[i]=sc.next();
        char[] word = console.readPassword("Enter password: ");
        String s=new String(word);
	String decoded= "";
        for (int j = 0; j < s.length(); j++) {
	char ch=s.charAt(j);
	ch=(char)(ch-5);  
	decoded+=ch;
       }
        pass[i]=decoded;
	} 
	for(int i=0;i<no;i++)
	{
	System.out.println(uname[i] + " - " + pass[i]);
	}   
	System.out.println("\n\t\t----------- Login ----------- ");

        System.out.print("Enter Username: ");
        String loginUser = sc.next();
	System.out.println("Enter Password : ");
	String loginPassword = sc.nextLine();
         
  }}

