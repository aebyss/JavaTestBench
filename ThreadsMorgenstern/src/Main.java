public class Main {

    public static void main(String[] args) {
        Counter count = new Counter();
        CountUpThread cut = new CountUpThread(count);
        CountDownThread cdt = new CountDownThread(count);
        Counter count2 = new Counter();
        CountUpThread cut2 = new CountUpThread(count2);
        CountDownThread cdt2 = new CountDownThread(count2);
        System.out.println("MAIN Start...");
        cut.start();
        cut2.start();
        cdt2.start();
        cdt.start();
        System.out.println("MAIN End...");

    }
}
