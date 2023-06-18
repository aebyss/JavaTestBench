public class GiroAccount extends BankAccount {

    private int maxOverdraft;

    public GiroAccount() {

    }

    public GiroAccount(int maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    public void print() {
        System.out.printf("maxOverdraft = %d, ", maxOverdraft);
        super.print();
    }

    public void print(String s) {
        System.out.print(s + " ");
        System.out.printf("maxOverdraft = %d, ", maxOverdraft);
        super.print();
    }

    public void setMaxOverdraft(int maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }
}
