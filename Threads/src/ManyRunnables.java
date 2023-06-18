public class ManyRunnables {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ABCRunnable()),
                t2 = new Thread(new ABCRunnable());
        t1.start();
        t2.start();
    }
}
