package guviPortalTaskTwo;

// Problem 1.3

public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double amt) {
        if (amt >= 0) {
            this.balance = amt;
        } else {
            System.out.println("Initial balance cannot be negative.So We setting balance to 0.");
            this.balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Cannot withdraw " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.displayBalance();

        Account account2 = new Account(500.0);
        account2.displayBalance();

        account2.deposit(200.0);
        account2.displayBalance();

        account2.withdraw(100.0);
        account2.displayBalance();

        account2.withdraw(700.0);
    }
}

