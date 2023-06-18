public class ThreadMaker {
    public static void lassInHintegrundLaufen(Runnable runnable) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
    }
}
