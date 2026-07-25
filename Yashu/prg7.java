import java.util.Scanner;
class prg7{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the character:");
char c=sc.next().charAt(0);
switch(c){
case'a':
case'e':
case'i':
case'o':
case'u':
case'A':
case'E':
case'I':
case'O':
case'U':

System.out.println("Vowel:" +c);
break;
default:
System.out.println("not vowel:" +c);
break;
}
}
}