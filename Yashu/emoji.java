/*
public class emoji{
public static void main(String args[]){
System.out.println("\uD83D\uDE00 Happy");
System.out.println("\uD83D\uDE02 Laugh");
System.out.println("\u Laugh");
}
}


public class emoji{
static void meth()
{
System.out.println("from static method:" +i);
}
static{
System.out.print11:29 14-07-202611:29 14-07-202611:29 14-07-2026ln("from static block");
}
public static void main(String args[]){
meth();
}
}*/

import java.util.Scanner;
public class emoji{
static void print(int n){
if(n==0)
	return;
print(n-1);
System.out.println(n+" ");
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number: ");
int n = sc.nextInt();
print(n);
}
}
