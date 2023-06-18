public class CountUp extends Thread {
    Counter counter;


    @Override
    public void run() {

            for(int i = 0; i < 1000; i++) {
                counter.increase(i);
            }
    }

    public static void main(String[] args) {
        CountUp cUp = new CountUp();
        Thread t = new Thread(cUp);
        t.start();
    }
}
