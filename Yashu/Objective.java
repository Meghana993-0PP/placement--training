Objective:
Create a Java program using product class and main class. Create arrays to manage product details and generate a simple bill.

Requirements
> Create arrays to store details of 5 products:
Product ID (int) , Product Name (String) , Product Price (double) , Product Quantity (int)
Read all product details from the user.
 
> Calculate the amount for each product.
Amount = Price × Quantity
Display the amount of each product.
Calculate the Total Bill Amount.

> Apply the following discount:
If Total Bill ≥ ₹5000 → 20% Discount
Else If Total Bill ≥ ₹3000 → 15% Discount
Else If Total Bill ≥ ₹1000 → 10% Discount
Otherwise → No Discount

> Calculate and display:
Total Bill
Discount Amount
Final Amount to Pay

Sample Output
--------------- PRODUCT BILL ----------------

ID    Name        Price    Qty    Amount
---------------------------------------------
101   Laptop      50000    1      50000
102   Mouse       500      2      1000
103   Keyboard    1200     1      1200
104   Pendrive    700      3      2100
105   Speaker     1500     2      3000

---------------------------------------------
Total Bill        : ₹57300.00
Discount (20%)    : ₹11460.00
Final Amount      : ₹45840.00
---------------------------------------------
 import java.util.Scanner;
class Product {
    int productId;
    String productName;
    double productPrice;
    int productQuantity;
    Product(int productId, String productName, double productPrice, int productQuantity) {
    }
    int calculateAmount() {
        amount = productPrice * productQuantity;
        System.out.println("the amount is :" +amount);
    }
    void display() {
        System.out.println(productId, productName, productPrice,productQuantity,calculateAmount());
    }
}
class Main{
    public static  void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
        int Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter Details of Product " + i);
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Product Quantity: ");
            int quantity = sc.nextInt();
            products[i] = new Product(id, name, price, quantity);
        }

  
}
    }


import winsound
>>> notes = [262,294,330,349,392,440,494,523,523,440,392,349,330,294,262] #C D E F G A B C
>>> for note in notes:
...     winsound.Beep(note,1500)