/*
import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
for(int i=1;i<no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
}
}

output:
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5

-----------------------------------------------------------------------------
import java.util.Scanner;
public class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( i + "  ");
	}// j++
	System.out.println();
} // i++
}
}

ouput:
1
2  2
3  3  3
4  4  4  4
5  5  5  5  5
----------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=no;j++)
	{
	System.out.print( i + "  ");
	}// j++
	System.out.println();
} // i++
}
}

output:
1  1  1  1  1
2  2  2  2  2
3  3  3  3  3
4  4  4  4  4
5  5  5  5  5
-------------------------------------------------------------------------------
import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=no;j++)
	{
	System.out.print( no + "  ");
	}// j++
	System.out.println();
} // i++
}
}

output:
5  5  5  5  5
5  5  5  5  5
5  5  5  5  5
5  5  5  5  5
5  5  5  5  5

------------------------------------------------------------------------------------
import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num :");
int no = sc.nextInt();
int a =1;
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( a++ + "  ");
	}// j++
	System.out.println();
} // i++
}
}

ouput:
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
----------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=no;i>=1;i--)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
}
}

ouput:
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1
-----------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=no;i>=1;i--)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
for(int i=1;i<no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++

}
}
output:
Enter a num:5
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1
1
1  2
1  2  3
1  2  3  4
--------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=1;i<no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
for(int i=no;i>=1;i--)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
}
}

output:
Enter a num:5
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1

--------------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no: ");
int no = sc.nextInt();
for(int i=no;i>0;i--)
{
	for(int s=i;s<=no;s++){
	System.out.print(" ");
	}
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
for(int i=1;i<=no;i++){
	for(int s=i;s<=no;s++){
	System.out.print(" ");
	}
for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++

}
}

output :
Enter a no: 5
 1  2  3  4  5
  1  2  3  4
   1  2  3
    1  2
     1
     1
    1  2
   1  2  3
  1  2  3  4
 1  2  3  4  5
-----------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a no: ");
int no = sc.nextInt();
for(int i=1;i<=no;i++){
	for(int s=i;s<=no;s++){
	System.out.print(" ");
	}
for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++

for(int i=no;i>=0;i--)
{
	for(int s=i;s<=no;s++){
	System.out.print(" ");
	}
	for(int j = 1;j<=i;j++)
	{
	System.out.print( j + "  ");
	}// j++
	System.out.println();
} // i++
}
}
-----------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=no;i>=1;i--)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print("*");
	}// j++
	System.out.println();
} // i++
}
} 

output:
Enter a num:5
*****
****
***
**
*
----------------------------------------------------------------------------------------
import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
int i,j;
for(int i=no;i>=1;i--)
{
	for(int j = i;j>=1;j--)
	{
	System.out.print( j+ "  ");
	}// j++
	System.out.println();
} // i++
}
}
----------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int no = sc.nextInt();
int a = 65;
for(int i=1;i<no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print((char)a++ + "  ");
	}// j++
	System.out.println();
} // i++
}
}

output:
Enter a number:6
A
B  C
D  E  F
G  H  I  J
K  L  M  N  O
-------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int no = sc.nextInt();
for(int i=1;i<no;i++)
{
	int a = 65;

	for(int j = 1;j<=i;j++)
	{
	System.out.print((char)a++ + "  ");
	}// j++
	System.out.println();
} // i++
}
}
output:
Enter a number:5
A
A  B
A  B  C
A  B  C  D
------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
int a = 65;
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=i;j++)
	{
	System.out.print((char)a++ + "  ");
	}// j++
	System.out.println();
} // i++
}
}

----------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=no;j++)
	{
	if(i==1 || j==1 || i==no || j==no)
	System.out.print(" * ");
	else
	System.out.print("   ");
	}// j++
	System.out.println();
} // i++
}
}

output:
Enter a num:5
 *  *  *  *  *
 *           *
 *           *
 *           *
 *  *  *  *  *

----------------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=no;j++)
	{
	if(i==j)
	System.out.print(" * ");
	else
	System.out.print("   ");
	}// j++
	System.out.println();
} // i++
}
}

output:
Enter a num:5
 *
    *
       *
          *
             *
---------------------------------------------------------------------------------------------------


import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=no;j++)
	{
	if(i==j || j==no-i+1)
	System.out.print(" * ");
	else
	System.out.print("   ");
	}// j++
	System.out.println();
} // i++
}
}

output:
Enter a num:5
 *           *
    *     *
       *
    *     *
 *           *
-----------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a num:");
int no = sc.nextInt();
for(int i=1;i<=no;i++)
{
	for(int j = 1;j<=no;j++)
	{
	if(i==j || j==no-1)
	System.out.print("*");
	else
	System.out.print("  ");
	}// j++
	System.out.println();
} // i++
}
}

output:
Enter a num:5
*    *
  *  *
    **
      *
      *
---------------------------------------------------------------------------------------------------------

import java.util.Scanner;
class Pattern{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a nymber:");
int no = sc.nextInt();
for(int i=1;i<=no;i++){
for(int j =1;j<=i;j++){
if((i+j) % 2== 0)
System.out.print("0");
else
System.out.print("1");
}
System.out.println(  );
}
}
}
output:
Enter a nymber:5
0
10
010
1010
01010
---------------------------------------------------------------------------------------------
output:
Enter a number:5
1       2       3       4       5

16      17      18      19      6

15      24      25      20      7

14      23      22      21      8

13      12      11      10      9


---------------------------------------------------------------------------------------------
*/
import java.util.Scanner;
public class Pattern{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int no = sc.nextInt();
int[][] matrix = new int[no][no]; //default value of array is zero
int num=1;
for(int r=0;r<(no+1)/2;r++)
{
	for(int c=r;c<no-r;c++) //Fill top rows
	{
	matrix[r][c]=num++;
	}
	for(int c=r+1;c<no-r;c++) //fill last cols
	{
	matrix[c][no-r-1] = num++;
	}
	for(int c=no-r-2;c>=r;c--) // fill last rows
	{
	matrix[no-r-1][c]=num++;
	}
 	for(int c=no-r-2;c>r;c--)
	{
	matrix[c][r]=num++;
	}

}
// Displaying matrix
for(int i =0 ;i<no;i++){
for(int j=0;j<no;j++){
System.out.print(matrix[i][j]+"\t");
}
System.out.println("\n");
}

}
}




