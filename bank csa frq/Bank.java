import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;
    private double savingInterestRate;

    //Constructor:
    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void setSavingsInterest(double rate) {
        savingInterestRate = rate;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public int numberOfAccounts() {
        return accounts.size();
    }

    public Account getAccount(String accountID) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getID().equals(accountID)) {
                return accounts.get(i);
            }
        }

        return null;
    }

    public boolean withdraw(String accountID, double amount) {

        Account a = getAccount(accountID);

        //Returns false if the account does not exist:
        if (a == null) {
            return false;
        }

        return a.withdraw(amount); //Withdraws and returns true if it succeeds, false if it does not
    }

    public boolean deposit(String accountID, double balance) {

        Account a = getAccount(accountID);
        if (a == null) {
            return false;
        }

        a.deposit(balance);
        return true;
    }

    public boolean transfer(String fromAccountID, String toAccountID, double amount) {

        //Gets both accounts:
        Account from = getAccount(fromAccountID);
        Account to = getAccount(toAccountID);

        //If either account does not exist, false is returned:
        if (from == null || to == null) {
            return false;
        }

        //Withdraws from first account and returns false if the withdraw is not successful:
        boolean withdraw = from.withdraw(amount);
        if (!withdraw) {
            return false;
        }

        //Deposits to second account and returns true if the code has made it this far:
        to.deposit(amount); //Deposit methods were declared as voids, so there is no indication of whether they work or not
        return true;
    }

    public void addInterest() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) instanceof SavingsAccount) {
                ((SavingsAccount) accounts.get(i)).addInterest(savingInterestRate);
            }
        }
    }

    public void reset() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) instanceof CheckingAccount) {
                ((CheckingAccount) accounts.get(i)).resetChecksUsed();
            }
        }
    }
}