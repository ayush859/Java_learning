import java.util.Scanner;

class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double addBalance) {
        balance += addBalance;
    }

    public void withdraw(double withdrawBalance) {
        if (withdrawBalance > balance)
            System.out.println("Insufficient funds! ");
        else
            balance -= withdrawBalance;
    }

    public void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

}
 

// Main class to demonstrate the functionality of the Student class
public class _06_Practice_Attributes_And_Methods {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        // Input account number and initial balance
        System.out.print("Enter the Account Number of the Student: ");
        
        String accountNumber = sc.nextLine();
        
        System.out.print("Enter the Initial Balance of the Student: ");
        
        double balance = sc.nextDouble();

        // Create a BankAccount object with the use of parameterised constructor
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        System.out.print("Enter the Deposited Balance of the Student: ");

        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        System.out.print("Enter the Withdraw Balance of the Student: ");

        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    
    }
}

 

// Below is the output statements

// System.out.println("Insufficient funds!");
// System.out.println("Account Number : " + accountNumber);
// System.out.println("Balance : " + balance);
