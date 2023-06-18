public class CustomerR extends Thread {
    private boolean transaction;
    private AccountR account;

    CustomerR(boolean bool, AccountR acc) {
        transaction = bool;
        account = acc;
    }

    @Override
    public void run() {
        if(transaction) {
            for(int i = 0; i < 1000; i++) {
                account.deposit(100);
            }
        } else {
            for(int i = 0; i < 1000; i++) {
                account.withdraw(100);
            }
        }
    }
}
