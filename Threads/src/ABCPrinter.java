public class ABCPrinter {
    public void run() {
        for(char b = 'A'; b <= 'Z'; b++) {
            System.out.print(b);
            MachMal.pause(100);
        }
        System.out.println();
    }
    public void start() {
        run();
    }
}
