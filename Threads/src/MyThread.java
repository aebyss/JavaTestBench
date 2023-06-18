public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Das ist ein Thread");
        try {
            Thread.sleep(1000);

        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
