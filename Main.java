import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount(1001, "Raagavi", 5000));
        accounts.add(new BankAccount(1002, "Priya", 7000));
        accounts.add(new BankAccount(1003, "Rahul", 3000));

        System.out.println("Bank Accounts");

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolder());
            System.out.println("Balance: ₹" + account.getBalance());
            System.out.println();
        }
    }
}