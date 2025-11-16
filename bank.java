public class bank {
    String accountNum;
    String name;            
    double balance;

    bank(){

    }
    public bank(String accountNum, String name, double balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Amount: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Amount: $" + amount);
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance! Your Current balance is: $" + balance);
        } 
        else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    public void accountDetails() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Balance: $ " + balance + "\n");
    }
    
}
