// NAMA : Raka Maulana Yusuf
// NIM  : 24060122140119
// File : BankApp.java

public class BankApp {
    public static void main(String[] args) {
      BankAccount account = new BankAccount(500.0);
  
      try {
        // skenario saldo mencukupi
        System.out.println("---------------------------------------");
        account.withdraw(200.0);
        System.out.println("Saldo Anda saat ini: $" + account.getBalance());
        System.out.println("---------------------------------------");


        // skenario saldo tidak mencukupi
        account.withdraw(400.0);
      } catch (InsufficientFundsException e) {
        System.out.println("---------------------------------------");
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error: Minimum balance required : $100.0");
        System.out.println("---------------------------------------");
      }
    }
  }
  