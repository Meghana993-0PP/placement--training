/*
//arrays
import java.util.Scanner;
class Array{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter No:");
int no = sc.nextInt();
int num = 1;
int arr1[][][] = new int[no][no][no];
for(int m = 0; m < no; m++){
    System.out.println("Matrix:" + m);
    for(int i = 0; i< no;i++){
        for(int j = 0;j<no;j++){
            arr1[m][i][j] = num++;
            System.out.print(arr1[m][i][j] + " ");
        }
        System.out.println(" ");
    }
}
    }
}
output:

Enter No:Matrix:0
1 2 3  
4 5 6  
7 8 9  
Matrix:1
10 11 12  
13 14 15  
16 17 18  
Matrix:2
19 20 21  
22 23 24  
25 26 27  
-------------------------------------------------------------------------------------------
import java.util.Scanner;
class Array{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter No:");
int no = sc.nextInt();
int num = 100;
int arr1[][][] = new int[no][no][no];
int arr2[][][] = new int[no][no][no];
int arr3[][][] = new int[no][no][no];


for(int m = 0; m < no; m++){
    System.out.println("Matrix:" + m);
    for(int i = 0; i< no;i++){
        for(int j = 0;j<no;j++){
            arr1[m][i][j] = num;
	    arr2[m][i][j] = arr1[m][i][j];
	    arr3[m][i][j] = arr1[m][i][j] + arr2[m][i][j];
            System.out.print(arr3[m][i][j] + " ");
            num=num+100;
        }
        System.out.println("");
    }
}
    }
}

output:
Enter No:Matrix:0
200 400 600 
800 1000 1200 
1400 1600 1800 
Matrix:1
2000 2200 2400 
2600 2800 3000 
3200 3400 3600 
Matrix:2
3800 4000 4200 
4400 4600 4800 
5000 5200 5400 
-------------------------------------------------------------------------------------------
// 4 substract
import java.util.Scanner;
class Array{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter No:");
int no = sc.nextInt();
int num = 1;
int arr1[][][][] = new int[no][no][no][no];
for(int m = 0; m < no; m++){
    System.out.println("Matrix:" + m);
    for(int i = 0; i< no;i++){
        for(int j = 0;j<no;j++){
            for(int k = 0;k<no;k++){
		arr1[m][i][j][k] = num++;
            System.out.print(arr1[m][i][j][k] + " ");
        }
        System.out.println(" ");
    }
    System.out.println(" ");
}
    }
}
}
output;
Enter No:Matrix:0
1 2  
3 4  
 
5 6  
7 8  
 
Matrix:1
9 10  
11 12  
 
13 14  
15 16 
-------------------------------------------------------------------------------------------

class Array{
    public static void main(String args[]) {
        int a[] = {1};
        int b[][] = {{1}};
        int c[][][] = {{{1}}};
        int d[][][][]={{{{1}}}};
    }
}
-------------------------------------------------------------------------------------------

class Array{
public static void main(String args[]){
int O1={1,2,3,4,5,6};
int O2={1,2,3};
int O3={1,2,3,4,5,6,7};
int twod={O1,O2,O3};
for(int s : twod){
for(int e:s){
System.out.print(e+" ");
}
}
}
}
----------------------------------------------------------------------------------------

class Array{
public static void main(String args[]){
int arr1[] = {1,2,3,4,5,6};
int hold[] = {10,9,8,7,6,5,4,3,2,1};
       System.arraycopy(arr1,0,hold,0,arr1.length);
for(int i :hold){
System.out.print(i+" ");
    }
}
}

output:
1 2 3 4 5 6 4 3 2 1 
--------------------------------------------------------------------------------------------------------------------

class Array{
public static void main(String args[]){
int arr1[] = {1,2,3,4,5,6};
int hold[] = {10,9,8,7,6,5,4,3,2,1};
       System.arraycopy(arr1,0,hold,4,arr1.length);
for(int i :hold){
System.out.print(i+" ");
    }
}
}
output:
10 9 8 7 1 2 3 4 5 6 
--------------------------------------------------------------------------------------------------------------------
// max value
import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value is: " + max);
    }
}
output:
Enter size: 3
Enter elements:
3 4 5
Maximum value is: 5
--------------------------------------------------------------------------------------------------------------------

// even numbers
import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int count=0; 
	for(int i =0;i < n; i++){
		if(arr[i] %2 == 0){
		 count++;
		
        }
    }
System.out.println(count);
}
}
---------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
for(int i =0;i<n;i++){
arr[i] = sc.nextInt();
}
for(int i = 0;i<n;i++){
int temp = arr[i];
arr[i] = arr[n - 1-i];
arr[n - 1-i]  = temp;
}
System.out.println("Reversed array: " +Arrays.toString(arr));        
        sc.close();
    }
}

---------------------------------------------------------------------------------------------------
*/
import java.util.*;
class Constructor{
static void main (password){
String result=" ";

