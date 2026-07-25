import java.util.Scanner;
class prg1{
public static  void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number:");
int no=sc.nextInt();
if(no>=0 && no<10){
System.out.print("single digit");
}
else if(no >= 10 && no<100){
System.out.print("two digit");
}
else if(no >= 100 && no<1000){
System.out.print("three digit");
}
else if(no >= 1000 && no<10000){
System.out.print("four digit");
}
else{
System.out.print("more than 4 digits");
}
}
}