public class CountDownThread extends Thread {

    Counter counter;

    public CountDownThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.dec();
            System.out.println("dec:" + counter);
        }
    }
}
