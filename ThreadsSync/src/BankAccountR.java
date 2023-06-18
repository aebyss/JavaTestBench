public class BankAccountR {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Programm zu Erzeugen von Raceconditions");
        for (int i = 0; i < 100_000; i++) {
            AccountR acc = new AccountR(1000);
            CustomerR trans1 = new CustomerR(true, acc);
            CustomerR trans2 = new CustomerR(false, acc);
            trans1.start();
            trans2.start();
            try {
                trans1.join();
                trans2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int res = acc.getBalance();
            if(res != 1000) {
                count++;
                System.out.println(res);
            }
        }
        System.out.println("Anzahl Raceconditions: " + count);
    }
}
