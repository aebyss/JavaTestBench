public class ABCThread extends Thread {
    @Override
    public void run() {
        for(char b = 'A'; b <= 'Z'; b++) {
            System.out.print(b);
            MachMal.pause(100);
        }
        System.out.println();
    }
}
