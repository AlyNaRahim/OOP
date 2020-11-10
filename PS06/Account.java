package ps06;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit (double amount){
        balance = balance + amount;
    }

    public void debit (double amount){
        if (amount < balance) {
            balance = balance - amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
    }

    public void print (){
        System.out.printf("A/C no: " + accountNumber + " Balance=" + "%.2f", balance);
    }

    @Override
    public String toString() {
        return  "A/C no:" + accountNumber +
                " Balance=" + String. format("%.2f", balance) ;
    }
}

