public class BankAccount {

    private int balance;
    private int accountNr;
    protected int clientNr;


    public BankAccount() {

    }
    public BankAccount(int balance, int accountNr) {
        this.balance = balance;
        this.accountNr = accountNr;
    }
    public void print() {
        System.out.printf("b = %d, aNr = %d, cNr = %d\n", balance, accountNr, clientNr);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setClientNr(int clientNr) {
        this.clientNr = clientNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public boolean withdraw(int amount) {
        balance -= amount;
        return true;
    }

    private void calculateInterest() {}
}
