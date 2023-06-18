public class ManyThreads {
    public static void main(String[] args) {
        ABCThread t1 = new ABCThread(),
                t2 = new ABCThread(),
                t3 = new ABCThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
