/*
// abstarct class

abstract class Emp{
    String empid = "E100";
    String empname = "XYZ";
    void display()
    {
        System.out.println("Emp ID:" +empid+ "-Emp Name:" +empname);
    }
}
class Manager extends Emp{}
class mainn{
    public static void main(String args[])
    {
        Manager e = new Manager();
        e.display();
    }
}

output:
Emp ID:E100-Emp Name:XYZ
---------------------------------------------------------------------------
//final class
final class Emp{
    String empid = "E100";
    String empname = "XYZ";
    void display()
    {
        System.out.println("Emp ID:" +empid+ "-Emp Name:" +empname);
    }
}
//class Manager extends Emp{}
class mainn{
    public static void main(String args[])
    {
        Manager e = new Manager();
        e.display();
    }
}
------------------------------------------------------------------------------
//private class
-----------------------------------------------------------------------------

// singleton variable

class Emp{
static String empid;
static String empname;
private static Emp e=new Emp();
public static Emp newInstance(String eid,String na)
{
empid=eid;
empname=na;
returnn e;
}
void display()
{
Sytem.out.println(e+"\nEmp id :"+empid+"-Emp Name:"+empname);
}
}
class july8
{
public static void main(String args[])
{
Emp e1=Emp.newInstance("E001","ABC");
e1.display();
e1=Emp.newInstance("E002","XYZ");
e1.display();
}}






import java.util.Scanner;

public class Mainn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
	if(ch >='A' && ch >= 'Z')
		upper++;
	else if(ch >= 'a' && ch>= 'z')
		lower++;
        }

        System.out.println("Uppercase : " + upper);
        System.out.println("Lowercase : " + lower);
    }
}
*/

import java.util.Scanner;

public class Mainn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
	if((ch >= 'A' && ch >= 'Z') || (ch >= 'a' && ch>= 'z')){
	letters++;
	}
	else if(ch >= '0' && ch >= '9'){
	digits++;
	} else{
	special++;

        }
	}
        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Special Characters : " + special);
    }
}

