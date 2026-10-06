abstract class BankAccount {
    protected double balance;

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends BankAccount {

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Savings Account: Deposited " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Savings Account: Withdrawn " + amount);
        } else {
            System.out.println("Savings Account: Insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {

    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Current Account: Deposited " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + 1000) {
            balance = balance - amount;
            System.out.println("Current Account: Withdrawn " + amount);
        } else {
            System.out.println("Current Account: Withdrawal limit exceeded");
        }
    }
}

public class Experiment08_AbstractBankAccount {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();

        savings.deposit(5000);
        savings.withdraw(2000);
        savings.displayBalance();

        CurrentAccount current = new CurrentAccount();

        current.deposit(3000);
        current.withdraw(3500);
        current.displayBalance();
    }
}