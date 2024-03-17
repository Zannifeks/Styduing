package lesson27.homework.PaymentSystem;

public class BankAccount implements PaymentSystem{

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
