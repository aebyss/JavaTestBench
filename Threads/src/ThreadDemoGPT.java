public class ThreadDemoGPT extends Thread {
    private String threadName;

    public ThreadDemoGPT(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("Thread " + threadName + " is running.");

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("Thread " + threadName + ": " + i);
                sleep(1000);  // Error 1: Missing InterruptedException handling
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Thread " + threadName + " exiting.");
    }

    public static void main(String[] args) {
        ThreadDemoGPT thread1 = new ThreadDemoGPT("Thread 1");
        ThreadDemoGPT thread2 = new ThreadDemoGPT("Thread 2");

        thread1.run();  // Error 2: Calling run() instead of start()
        thread2.start();
    }
}
