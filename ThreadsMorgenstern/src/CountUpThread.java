public class CountUpThread extends Thread{
Counter counter;

    public CountUpThread(Counter count) {
        this.counter = count;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            counter.inc();
            System.out.println("inc:"+counter);
        }
    }
}
