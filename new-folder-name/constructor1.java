/*
class Emp
{
public Emp()
{
System.out.println("From default constructor");
}
public Emp(String Ename)
{
System.out.println("from parameterized"+Ename);
}
}
class constructor1{
public static  void main(String args[]){
Emp e=new Emp();
e=new Emp("XYZ");
}
}

output:
From default constructor
from parameterizedXYZ
===========================================================================================================================
class Emp
{
public Emp() //step2
{
this("ChARAN SAI"); //step3
System.out.println("Welcome to ABC soulution");
}
public Emp(String Ename)//step 4
{
this("IT",2000000);
System.out.println("Hi......"+Ename+" you are appointed");
}
public Emp(String dept, int salary){
System.out.println("Department"+dept+" \nyou are basic salary" + salary);
}
}
class constructor1{
public static  void main(String args[]){
Emp e=new Emp();
}
}

output:
DepartmentIT
you are basic salary2000000
Hi......ChARAN SAI you are appointed
Welcome to ABC soulution
=======================================================================================================

class Emp
{
public Emp() //step2
{
this("ChARAN SAI"); //step3
System.out.println("Welcome to ABC soulution");
}
public Emp(String Ename)//step 4
{
System.out.println("Hi......"+Ename+" you are appointed");
this("IT",2000000);
}
public Emp(String dept, int salary){
System.out.println("Department"+dept+" \nyou are basic salary" + salary);
}
}
class constructor1{
public static  void main(String args[]){
Emp e=new Emp();
}
}
======================================================================================================

class A{
int def1;
private int pri1;
protected int pro1;
public int pub1;

void displayA()
{
System.out.println("\t\tFrom Class A:");
System.out.println("default:" + def1);
System.out.println("private:" +pri1);
System.out.println("protected:" + pro1);
System.out.println("public:"+pub1);
}
}
class constructor1{
public static  void main(String args[]){
A a=new A(); a.displayA();
}
}

output:
From Class A:
default:0
private:0
protected:0
public:0
===================================================================================================

class A{
int def1;
private int pri1;
protected int pro1;
public int pub1;

void displayA()
{
System.out.println("\t\tFrom Class A:");
System.out.println("default:" + def1);
System.out.println("private:" +pri1);
System.out.println("protected:" + pro1);
System.out.println("public:"+pub1);
}
}
class B extends A // inherite
{
void displayB()
{
System.out.println("\t\tFrom Class B:");
System.out.println("default:" + def1);
//System.out.println("private:" +pri1);
System.out.println("protected:" + pro1);
System.out.println("public:"+pub1);
}
}
class constructor1{
public static  void main(String args[]){
A a=new A(); a.displayA();
B b = new B(); b.displayB();
}
}
output:
                From Class A:
default:0
private:0
protected:0
public:0
                From Class B:
default:0
protected:0
public:0
======================================================================================================
class A{
int def1;
private int pri1;
protected int pro1;
public int pub1;

void displayA()
{
System.out.println("\t\tFrom Class A:");
System.out.println("default:" + def1);
System.out.println("private:" +pri1);
System.out.println("protected:" + pro1);
System.out.println("public:"+pub1);
}
}
class B extends A // inherite
{
void displayB()
{
System.out.println("\t\tFrom Class B:");
System.out.println("default:" + def1);
//System.out.println("private:" +pri1);
System.out.println("protected:" + pro1);
System.out.println("public:"+pub1);
}
}
class C
{
void displayC()
{
A obj1=new A();
System.out.println("\t\tFrom Class C:");
System.out.println("default:" + obj1.def1);
//System.out.println("private:" + obj1.pri1);
System.out.println("protected:" + obj1.pro1);
System.out.println("public:"+ obj1.pub1);
}
}

class constructor1{
public static  void main(String args[]){
A a=new A(); a.displayA();
B b = new B(); b.displayB();
C c = new C(); c.displayC();
}
}

output:
                From Class A:
default:0
private:0
protected:0
public:0
                From Class B:
default:0 /
protected:0
public:0
                From Class C:
default:0
protected:0
public:0
================================================================================================

import java.util.Scanner;
public class constructor1 {
	static int f1=1,f2=1,f3=0;
	static int count = 0,num = 2;
   static void Fibonacci() {
      if (count == 0 || count == 1)
	System.out.print(1+" ");
	count ++;
}
else{
f3=f1+f2;
System.out.print(f3+" ");
f1 = f2;
f2=f3;
      }
          }
static void Prime() {
while (true) {
boolean isPrime = true;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i ==0) {
isPrime = false;
break;
}
}
if (isPrime) {
System.out.print(num+" ");
num++;
break;
}
num++;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
for(int i =1;i<=N;i++){
if(i % 2 == 1)
fibonacci();
else
prime();
}
}
}

}
}
=========================================================================================================

//single inheritance
class Emp {

    String eno, ename;

    public Emp(String eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    void empRecords() {
        System.out.println("Emp No: " + eno);
        System.out.println("Emp Name: " + ename);
    }
}

class Manager extends Emp {

    String dept;

    public Manager(String eno, String ename, String dept) {
        super(eno, ename);
        this.dept = dept;
    }

    void manRecords() {
        System.out.println("Dept: " + dept);
    }
}

public class constructor1 {

    public static void main(String args[]) {

        Manager m = new Manager("E001", "Ajay", "IT");

        m.empRecords();
        m.manRecords();
    }
}
output:
Emp No: E001
Emp Name: Ajay
Dept: IT
===========================================================================================

// multi level inheritanceclass Emp {
    String eno, ename;

    public Emp(String eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    void empRecords() {
        System.out.println("Emp No: " + eno);
        System.out.println("Emp Name: " + ename);
    }
}

class Manager extends Emp {
    String dept;

    public Manager(String eno, String ename, String dept) {
        super(eno, ename);
        this.dept = dept;
    }

    void manRecords() {
        System.out.println("Dept: " + dept);
    }
}

class Project extends Manager {

    public Project(String pName, String eno, String ename, String dept) {
        super(eno, ename, dept);
        System.out.println("Project Name: " + pName);
    }
}

class constructor1 {
    public static void main(String args[]) {

        Project p = new Project("AirLine Reservation", "E001", "Ajay", "IT");

        p.empRecords();
        p.manRecords();
    }
}
output:
Project Name: AirLine Reservation
Emp No: E001
Emp Name: Ajay
Dept: IT
==================================================================================

//  Hierariccal inheritance
class Emp {

    String eno, ename;

    public Emp(String eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    void empRecords() {
        System.out.println("Emp No: " + eno);
        System.out.println("Emp Name: " + ename);
    }
}

class Manager extends Emp {

    String dept;

    public Manager(String eno, String ename, String dept) {
        super(eno, ename);
        this.dept = dept;
    }

    void manRecords() {
        System.out.println("Dept: " + dept);
    }
}

class Project extends Emp {

    String pName;

    public Project(String pName, String eno, String ename) {
        super(eno, ename);
        this.pName = pName;
    }

    void projectRecords() {
        System.out.println("Project Name: " + pName);
    }
}

public class constructor1 {

    public static void main(String args[]) {

        Manager m = new Manager("E001", "Ajay", "IT");
        m.empRecords();
        m.manRecords();

        System.out.println();

        Project p = new Project("Airline Reservation", "E003", "ABC");
        p.empRecords();
        p.projectRecords();
    }
}
output:
Emp No: E001
Emp Name: Ajay
Dept: IT

Emp No: E003
Emp Name: ABC
Project Name: Airline Reservation
=============================================================================================

//hybrid inheritance
class Emp {

    String eno, ename;

    public Emp(String eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    void empRecords() {
        System.out.println("Emp No: " + eno);
        System.out.println("Emp Name: " + ename);
    }
}

class Manager extends Emp {

    String dept;

    public Manager(String eno, String ename, String dept) {
        super(eno, ename);//base class constructor
        this.dept = dept;
	this("Madurai");// pass value to current class constructor
    }
public Manager(String Loc)
{
	super("","");
System.out.println("Location :" +Loc);
}

    void manRecords() {
        System.out.println("Dept: " + dept);
    }
}

public class constructor1 {

    public static void main(String args[]) {

        Manager m = new Manager("E001", "Ajay", "IT");

        m.empRecords();
        m.manRecords();
    }
}
===================================================================
*/
class Emp {
    String eno, ename;
    public Emp(String eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
    void empRecords() {
        System.out.println("Emp No   : " + eno);
        System.out.println("Emp Name : " + ename);
    }
}
class Manager extends Emp {
    String dept;
    public Manager(String eno, String ename, String dept) {
    this("Madurai"); // pass value to current class constructor        
    super(eno, ename);// passing value to base class constructor
        this.dept = dept;
        
    }
    public Manager(String Loc)
   {
       super(" ", " ");
   System.out.println("Location :" +Loc);
   }
    void manRecords() {
        System.out.println("Department : " + dept);
    }
}
class Main {
    public static void main(String args[]) {
        Manager m = new Manager("E002", "XYZ", "IT");
        m.empRecords();
        m.manRecords();
    }
}