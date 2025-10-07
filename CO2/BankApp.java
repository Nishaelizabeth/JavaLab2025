class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    static int accountCount = 1000;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = ++accountCount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String getAccountHolder() { return accountHolder; }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    void displayTransaction() {
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Alice", 5000);
        BankAccount b2 = new BankAccount("Bob", 3000);

        double amount = 1500;
        String status;

        if (b1.withdraw(amount)) {
            b2.deposit(amount);
            status = "Successful";
        } else {
            status = "Failed - Insufficient Balance";
        }

        Transaction t = new Transaction(b1.getAccountNumber(), b2.getAccountNumber(), amount, status);
        t.displayTransaction();
    }
}
