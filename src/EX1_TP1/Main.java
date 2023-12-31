package EX1_TP1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, "John Doe", 1000);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account holder name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
