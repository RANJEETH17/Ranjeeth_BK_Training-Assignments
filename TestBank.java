package collectionDemo;

class BankAccount {

    private String accountNo;
    private double balance;

    public BankAccount() {}

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        if(balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    // Getters
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // Methods
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds!");
        }
    }
}

// ------------------ Savings Account ------------------------
class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        double interest = (getBalance() * interestRate) / 100;
        deposit(interest);
        System.out.println("Interest Added: " + interest);
    }
}

// ------------------ Salary Account ------------------------
class SalaryAccount extends BankAccount {

    private double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        deposit(monthlySalary);
        System.out.println("Salary Credited: " + monthlySalary);
    }
}

// ------------------ Main Class to Test ------------------------
public class TestBank {
    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");
        SavingsAccount sa = new SavingsAccount("SA101", 5000, 5.5);
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.addInterest();
        System.out.println("Final Balance: " + sa.getBalance());

        System.out.println("\n----- Salary Account -----");
        SalaryAccount salAcc = new SalaryAccount("SAL201", 8000, 25000);
        salAcc.deposit(500);
        salAcc.creditSalary();
        salAcc.withdraw(3000);
        System.out.println("Final Balance: " + salAcc.getBalance());
    }
}
