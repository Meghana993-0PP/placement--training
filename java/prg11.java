// FOR LOOP//


/*import java.util.Scanner;
class prg11{
public static void main(String args[])*/
{
Scanner sc = new Scanner(System.in);
System.out.print("enter no:");
int no=sc.nextInt();
for(int i=0;i<=no;i=i+3){
System.out.println(i+" ");
}
}
}


import java.util.Scanner;
class prg11{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter no:");
int no=sc.nextInt();
int i,j;
for(i=1,j=1;i<=no && j<=no;i=i+2,j=j+3){
System.out.println("i is : "+ i + "-j is :" +j);
}
}
}


import java.util.Scanner;
class prg11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no:");
int no = sc.nextInt();
System.out.print("Enter table:");
int table = sc.nextInt();
for(int i=1;i<=no;i++){
System.out.println(i "*" +table+"=" +(i*table));
}
}
}

import java.util.Scanner;
class prg11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no:");
int no = sc.nextInt(); //5
for(int i=1;i<=no;i++) //outer for
{
for(int j=1;j<=i;j++)//inner for
{
System.out.print(j + " ");
}//j++
System.out.println();
}//i++
}
}
*/


