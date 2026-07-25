import java.util.Scanner;
class prg8{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the month:");
String c = sc.next();
switch(c){
case'april':
System.out.println("summer");
break;
case'nov':
System.out.println("winter");
break;
case'july':
System.out.println("rainy");
break;
case'march':
System.out.println("spring");
break;
default:
}
System.out.println("the season is:" + c);
}
}