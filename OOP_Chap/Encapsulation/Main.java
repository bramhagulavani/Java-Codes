// Example 1 — Bank Account


package OOP_Chap.Encapsulation;

class BankAccount {
  private int balance = 0; // hidden

  public void deposit(int amount) {
    balance += amount;
  }

  public int getBalance() {
    return balance;
  }
}

public class Main {
  public static void main(String[] args) {
    BankAccount acc = new BankAccount();
    acc.deposit(500);
    System.out.println(acc.getBalance());
  }
}
