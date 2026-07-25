
import java.util.Scanner;

class Bank {

    int balance;

    
    Bank(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void balance() {
        System.out.println("Balance : " + balance);
    }
}

public class miniproject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome Yashuu....");
        System.out.print("Enter Principle Amount : ");
        int amount = sc.nextInt();

        Bank b = new Bank(amount);

        while (true) {

            System.out.println("\n\t\tMENU");
            System.out.println("\t-------------------");
            System.out.println("\t1. Deposit");
            System.out.println("\t2. Withdraw");
            System.out.println("\t3. Balance");
            System.out.println("\t4. Exit");

            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount : ");
                    int deposit = sc.nextInt();
                    b.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount : ");
                    int withdraw = sc.nextInt();
                    b.withdraw(withdraw);
                    break;

                case 3:
                    b.balance();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}