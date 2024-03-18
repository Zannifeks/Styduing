package lesson27.homework.PaymentSystem;

public class ElectronicWallet implements PaymentSystem{

    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void depositMoney(double amount) {
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
