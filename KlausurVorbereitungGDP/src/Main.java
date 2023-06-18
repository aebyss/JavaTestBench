public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        GiroAccount g = new GiroAccount();

        g.setAccountNr(22);
        g.setClientNr(123);
        g.setMaxOverdraft(500);
        g.deposit(1000);

        b.print();
        g.print();
        g.print("Nochmal: ");




    }
}
