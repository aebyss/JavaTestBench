public class MachMal {
    public static void pause(int zeit) {
        try {
            Thread.sleep(zeit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
