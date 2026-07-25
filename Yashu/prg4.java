import java.util.Scanner;
class prg4{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the number a:");
int a = sc.nextInt();
System.out.print("enter the number b:");

int b = sc.nextInt();

System.out.print("enter the number c:");
int c =sc.nextInt();

if(a>b){
	if(a>c)
		System.out.println("a is big");
	else
		System.out.println("c is big");
}else{
	if(b>c)
		System.out.println("b is big");
	else 
		System.out.println("c is big");
}
}
}