public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " taka");
        } else {
            System.out.println("Failed to deposit: Amount should be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + " taka");
            } else {
                System.out.println("Failed to withdraw: Insufficient balance.");
            }
        } else {
            System.out.println("Failed to withdraw: Invalid amount entered.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance + " taka");
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("223014100", 1000.0);
        account1.display();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(2000.0);
        account1.display();

        BankAccount account2 = new BankAccount("223014098", 500.0);
        account2.display();
        account2.deposit(100.0);
        account2.withdraw(50.0);
        account2.display();
    }
}

