public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setSavingsInterest(0.25);
        Account a1 = new SavingsAccount("alice", 100.00);
        Account a2 = new CheckingAccount("bob", 50.00);
        bank.addAccount(a1);
        bank.addAccount(a2);
        System.out.println("Number of accounts: " + bank.numberOfAccounts());
        boolean result = bank.withdraw("alice", 20.00);
        System.out.println(result);
        result = bank.deposit("bob", 20.00);
        System.out.println(result);
        bank.addInterest();
        System.out.println(bank.getAccount("alice"));
        System.out.println(bank.getAccount("bob"));
    }
}