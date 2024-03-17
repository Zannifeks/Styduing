package lesson27.homework;


import lesson27.homework.PaymentSystem.BankAccount;
import lesson27.homework.PaymentSystem.ElectronicWallet;
import lesson27.homework.Triathlete.Triathlete;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW# 27
 * @author Shilinski Rodion
 * @version 15.03.2024
 */
public class HomeWork {
    public static void main(String[] args) {
        //task 1
        ElectronicWallet electronicWallet = new ElectronicWallet(200);
        System.out.println("Current balance of electronic wallet is: " + electronicWallet.checkBalance());

        System.out.println("You recived transfer 1000 on your electronic wallet");
        electronicWallet.transferMoney(1000);
        System.out.println("Withdrawing 400 from your electronic wallet");
        electronicWallet.withdrawMoney(400);
        System.out.println("Current balance of electronic wallet is: " + electronicWallet.checkBalance());


        BankAccount bankAccount = new BankAccount(1500);
        System.out.println("Current balance of your bank account is: " + bankAccount.checkBalance());

        System.out.println("We withdrawed 500 from your balance");
        bankAccount.withdrawMoney(500);
        System.out.println("Current balance of your bank account is: " + bankAccount.checkBalance());

        System.out.println("You recived 300 on your balance");
        bankAccount.transferMoney(300);
        System.out.println("Current balance of your bank account is: " + bankAccount.checkBalance());

                //task 2
        Triathlete triathlete = new Triathlete();

        triathlete.run();
        triathlete.swim();
    }
}
