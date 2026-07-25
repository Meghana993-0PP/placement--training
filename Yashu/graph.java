/*import java.util.*;
class main{
public static void printMatrix(int A[][], int rows){
int i,j;
for(i=0;i<rows;i++){
for(j=0;j<rows;j++){
System.out.print(A{i][j]+"");
}
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of nodes:");
int rows=sc.nextInt();
System.out.print("Enter no of edges:");
int edges=sc.nextLine();
Sytem.out.print("Is this directed?:");
String directed=sc.next();
int A[]=new int[rows+1][rows+1];
for(int i=1;i<=rows;i++){
for(int j=1;j<=rows;j++){
A[i][j]=0;
}
}
printadjmatrix(A,rows);
for (int i=1;i<=edges;i++){
System.out.orintln("Enter the start node,end node and weight of edge n0"+i);
snode=sc.nextInt();
enode=sc.nextInt();
weight=sc.nextInt();
if((directed.equals("yes"))==true){
A[snode][enode]=weight;
}
esle{
A[snode][enode]=weight;
A[enode][snode]=weight;
}
}
printadjmatrix(A,rows);
}}
=======================================================

import java.util.*;
class graph
{
public static void printMatrix(int A[][],int rows)
{
int i,j;
for(i=0;i<=rows;i++)
{
   for(j=0;j<=rows;j++)
   {
    System.out.print(A[i][j] + " ");
   }
System.out.println();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no of nodes : ");
int rows=sc.nextInt();
int  snode,enode,weight;
System.out.print("Enter No of edges :");
int edges=sc.nextInt();
System.out.print("Is this directed ? ");
String directed=sc.next();  
int A[][]=new int[rows+1][rows+1];
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                A[i][j]=0;
            }
        }
        printMatrix(A,rows);
        for(int i=1;i<=edges;i++){
            System.out.print("Enter the start node, end node and weight of edge no 1 : "+i);
            snode=sc.nextInt();
            enode=sc.nextInt();
            weight=sc.nextInt();
            if((directed.equals("yes"))==true){
                A[snode][enode]=weight;
            }
            else{
                A[snode][enode]=weight;
                A[enode][snode]=weight;
            }
        }
        printMatrix(A,rows);
    }}
============================================================================================import java.util.*;
class graph{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter no :");
int n = sc.nextInt();
int dp[] = new int[n+1];//size +1-rule

dp[0] = 0;//base case // rule 2
dp[1] = 1;
System.out.println(0+"-" +"0");
system.out.println(1+"-" +"1");
for(int i=2;i<=n;i++)
{
dp[i]=dp[i-1]+dp[i-2];
System.out.println(i+"-"+dp[i]);
}
System.out.println("Last Fibo :" +dp[n]);
System.out.print("Enter No:");
n = sc.nextInt();
for(int i=1;i<=n;i++)
{  hi0
System.out.println("Enter dp index: ");
System.out.println("Fibo:" +dp[sc.nextInt()]);
}
}
}
=========================================================================================
import java.util.*;
class graph{
static int dp[];
static int fact(int n){
if(n==0)
return 1;
if(dp[n] != 0)//already filled
return dp[n];
dp[n]=n*fact(n-1);
return dp[n];
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no:");
int n = sc.nextInt();
dp=new int[n+1];
System.out.println("Fact Value:" + fact(n));
System.out.println("Fact Value :" +fact(sc.nextInt()));
System.out.println("Fact value :" + fact(sc.nextInt()));
}
}

===============================================================================================
//largest common subsequence
import java.util.*;
class graph{
public static  void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Text1: ");
String text1 = sc.next();
System.out.print("Enter Text2: ");
String text2 = sc.next();
int m = text1.length();
int n = text2.length();
int dp[][] = new int[m+1][n+1];
for(int i = 1;i<=m;i++)
{
for(int j =1;j<=n;j++)
{
if(text1.charAt(i-1) == text2.charAt(j-1))
{
dp[i][j]=dp[i-1][j-1]+1;
}
else
{
dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
}
}
}
System.out.println("LCS:"+dp[m][n]);
}
}
==============================================================================================
*/
// largest palindrome subsequence
import java.util.*;
class graph{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter text:");
String text = sc.next();
int m = text.Length();
int dp[][]=new int[m+1][m+1];
for(int i=0;i<m;i++)
{
dp[i][j]=1;//base case
}
for(int i=m;i>=0;i--)
{
for(int j=i+1;j<m;j++)
{
if(text.charAt(i) == text.charAt(j))
{
dp[i][j]=dp[i+1][j-1]+2;
}
else
{
dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
}
}
}
System.out.println("Palindrome Subsequence : " +dp[0][m-1]);
}
}




