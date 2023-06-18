public class AccountR {
    private int balance;

    AccountR(int i) {
        balance = i;
    }

    public synchronized void deposit(int n) {
        balance = balance + n;
    }

    public synchronized void withdraw(int m) {
        balance -= m;
    }

    public int getBalance() {
        synchronized (this) {
            return balance;
        }
    }

}
