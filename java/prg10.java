import java.util.Scanner;
class prg10{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter no:");
int no=sc.nextInt();
for(int i=0;i<=no;i++){
System.out.println(i+" ");
}
}
}



import java.util.Scanner;
class prg10{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter no:");
int no=sc.nextInt();
for(int i=0;i<=no;){
System.out.println(i+" ");
i++;
}//i++ will work after this
}
}


import java.util.Scanner;
class prg10{
public static void main(String args[])
{
int i=1;
Scanner sc = new Scanner(System.in);
System.out.print("enter no:");
int no=sc.nextInt();
for(;i<=no;){
System.out.println(i+" ");
i++;
}//i++ will work after this
}
}

import java.util.Scanner;
class prg10{
public static void main(String args[])
{
int i=0;
Scanner sc = new Scanner(System.in);
System.out.print("enter no:");
int no=sc.nextInt();
for(;i++<=no;){
System.out.println(i+" ");
}//i++ will work after this
}
}

