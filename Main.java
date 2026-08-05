public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      BankAccount var1 = new BankAccount(1001, "Raagavi", (double)5000.0F);
      System.out.println("Bank Account Created");
      System.out.println("Account Number: " + var1.getAccountNumber());
      System.out.println("Account Holder: " + var1.getAccountHolder());
      System.out.println("Balance: â‚¹" + var1.getBalance());
   }
}
