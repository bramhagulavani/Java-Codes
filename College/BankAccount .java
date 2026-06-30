public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void Display() {
        System.out.println("\n--- Account Status ---");
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.printf("Current Balance: $%.2f\n", this.balance);
        System.out.println("----------------------");
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Transaction: Deposited $%.2f.\n", amount);
        } else {
            System.out.println("Transaction Failed: Deposit amount must be positive.");
        }
    }

    public void Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Transaction Failed: Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Transaction Failed: Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.printf("Transaction: Withdrew $%.2f.\n", amount);
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", "123456789", 500.00);

        account1.Display();
        
        account1.Deposit(150.50);
        
        account1.Display();
        
        account1.Withdraw(75.25);
        
        account1.Display();
    }
}