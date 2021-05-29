package section_6;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String accountPhoneNumber;

    //constructor with parameters
    public Account(String number, double balance, String customerName, String customerEmail, String accountPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.accountPhoneNumber = accountPhoneNumber;
    }

    //constructor without parameters
    //we can call using keyword "this" constructor with parameter and set default values
    public Account() {
        this ("56789",2.5,"Default name","default email","default phone");
    }

    //constructor that will use 2 parameters by default.
    public Account(String customerName, String customerEmail, String accountPhoneNumber) {
        this("99999",100.55,customerName,customerEmail,accountPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(String accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }
    public void deposit(double depositAmount) {
        this.balance+=depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdraw(double withdrawalAmount) {
        if(withdrawalAmount > this.balance) {
            System.out.println("Insufficient balance. Only "+ this.balance + " available.");
        }
        else {
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }
    }
}
