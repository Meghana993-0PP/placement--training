import java.util.Scanner;
class prg3{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the character:");
char ch =sc.next().charAt(0);
int as=ch;
if(as>=65 && as<90){
System.out.println("character is:" +ch + " - capital letter");
}else if(as>=97 && as<122){
System.out.println("character is:" +ch+ " -small letter");
}else if(as>=48 && as<57){
System.out.println("character is:" +ch+ " -number");
}
else if(as>=33 && as<47){
System.out.println("character is:" +ch+ " -symbol");
}
}
}