public class Ente extends Tier {
    public void trifft(Tier t) {
        System.out.println("Mh?");
    }
    public void trifft(Ente e) {
        System.out.println("Hi!");
    }
    public void trifft(Hund h) {
        System.out.println("Oh!");
    }

    public static void main(String[] args) {
        Tier t = new Ente();
        Ente e = new Ente();
        Tier h = new Hund();
        Hund h2 = (Hund)h;

        e.trifft(t);
        t.trifft(e);
        t.trifft(t);
        e.trifft(h);
        e.trifft(h2);
        t.trifft(h2);
    }
}
