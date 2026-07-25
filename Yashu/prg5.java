import java.util.Scanner;
class prg5{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the number a:");
int a = sc.nextInt();
System.out.print("enter the number b:");
int b = sc.nextInt();
	System.out.println(a>b?" a is big":"b is big");
}
}