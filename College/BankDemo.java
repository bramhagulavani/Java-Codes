import java.util.*;
interface AccountOperations {
    void depositMoney(double amount);
    void withdrawMoney(double amount);
    void showAccountDetails();
}

class BankAccount implements AccountOperations {
    String holderName;
    String accountNumber;
    double balance;

    public BankAccount(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Not enough balance");
        }
    }

    public void showAccountDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String holderName, String accountNumber, double balance, double interestRate) {
        super(holderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Bramha", "123456789", 5000, 5);
        myAccount.showAccountDetails();
        myAccount.depositMoney(2000);
        myAccount.withdrawMoney(1000);
        myAccount.addInterest();
        myAccount.showAccountDetails();
    }
}
