package ps07;

public class Account {
    private int id;
    private Customer2 customer;
    private double balance = 0.0;

    public Account(int id, Customer2 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer2 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        balance = balance * 100;
        balance = Math.round(balance);
        balance = balance /100;
        return customer.toString() + " balance=$" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit (double amount){
        this.balance += amount;
        return new Account(id, customer, balance);
    }

    public Account withdraw (double amount){
        if (balance >= amount) {
            this.balance = balance - amount;
            return new Account(id, customer, balance);
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
            return this;
        }
    }
}
