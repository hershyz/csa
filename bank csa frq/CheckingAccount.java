public class CheckingAccount extends Account {

    public CheckingAccount(String id, double initialBalance) {

        //The only statement that needs to be made here is the super constructor call:
        super(id, initialBalance);
    }

    private int numberOfChecksUsed = 0;

    public boolean withdraw(double amount) {

        //Only allows a withdrawal if there will be at least $0 left in the balance:
        if (balance - (amount + 1) >= 0) {
            balance -= (amount + 1); //$1 transaction fee
            return true;
        }

        return false; //If the withdrawal was not made, the method returns false
    }

    public void deposit(double amount) {

        balance += (amount - 1); //$1 transaction fee
    }

    public void resetChecksUsed() {
        numberOfChecksUsed = 0;
    }

    public int getChecksUsed() {
        return numberOfChecksUsed;
    }

    public boolean withdrawUsingCheck(double amount) {

        int upcharge = 0;
        if (numberOfChecksUsed > 3) {
            upcharge = 2;
        }

        //Does not allow the balance to go below -$10:
        if (balance - (amount + upcharge) >= -10) {
            balance -= (amount + upcharge);
            numberOfChecksUsed++; //Increments check count
            return true;
        }

        return false;
    }
}
