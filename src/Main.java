public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System. out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%");

        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println();
        System. out.println(" Account Operations ");
        acc1.deposit(500.0);
        acc2.withdraw(300.0);

        System.out.println();
        System. out.println(" Interest Calculation ");
        System.out.println(acc1.accountHolderName + "'s interest: $" + acc1.calculateInterest());
        System.out.println(acc2.accountHolderName + "'s interest: $" + acc2.calculateInterest());
        System.out.println(acc3.accountHolderName + "'s interest: $" + acc3.calculateInterest());

        System.out.println();
        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}

 class BankAccount {
    static String bankName = "LiceoBank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    private static int accountCounter = 1;

    String accountNumber;
    String accountHolderName;
    double balance;

    public static String generateAccountNumber() {
        return String.format("ACC%03d", accountCounter++);
    }
    
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName +
                " with initial balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}
