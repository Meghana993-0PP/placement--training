import java.util.Scanner;
class prg6{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the number a:");
int a = sc.nextInt();
System.out.print("enter the number b:");
int b = sc.nextInt();
System.out.print("enter the number c:");
int c = sc.nextInt();

	System.out.println(a>b?(a>c? "a is big":"c is big"):( b>c? "b is big"));
}
}