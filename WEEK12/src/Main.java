import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> myAccounts = new ArrayList<>();

        BankAccount a1 = new BankAccount(1, "Sevval", 1000.0);
        BankAccount a2 = new BankAccount(2, "Ateds", 1500.0);
        BankAccount a3 = new BankAccount(3, "Derya", 1200.0);
        BankAccount a4 = new BankAccount(4, "Melisa", 2000.0);

        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        Collections.sort(myAccounts);

        System.out.println("Accounts before balance :");
        for (BankAccount account : myAccounts) {
            System.out.println("Holder: " + account.getHolderName() + ", Balance: " + account.getBalance());
        }

        for (BankAccount account : myAccounts) {
            account.balanceChange(500.0);
        }

        System.out.println("\nAccounts after balance:");
        for (BankAccount account : myAccounts) {
            System.out.println("Holder: " + account.getHolderName() + ", Balance: " + account.getBalance());
        }
    }
}