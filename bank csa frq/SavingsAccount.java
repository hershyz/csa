public class SavingsAccount extends Account {

    public SavingsAccount(String id, double initialDeposit) {

        super(id, initialDeposit); //Calls super as first method in the constructor

        //If the initial deposit is greater than $10k, the bank adds another $200:
        if (initialDeposit >= 10000) {
            deposit(200);
        }
    }

    public boolean withdraw(double amount) {

        //Only allows a withdrawal if there will be at least $10 left in the balance:
        if (balance - (amount + 2) >= 10) {
            balance -= (amount + 2); //$2 transaction fee
            return true;
        }

        return false; //If the withdrawal was not made, the method returns false
    }

    public void deposit(double amount) {

        balance += amount;
    }

    public double addInterest(double rate) {

        double increment = (balance * (rate / 100));

        //First updates the balance, then returns the new interest:
        deposit(increment);
        return increment;
    }
}