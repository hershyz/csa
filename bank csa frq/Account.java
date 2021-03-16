public abstract class Account {

    protected String id;
    protected double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Balance: " + balance;
    }

    public abstract boolean withdraw(double amount);
    public abstract void deposit(double amount);
}