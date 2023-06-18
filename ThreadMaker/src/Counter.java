public class Counter extends Thread {

    public void countEven(int x) {
        for (int i = 0; i < 10; i++) {
            if(x % 2 == 0) {
                System.out.println(x);;
            }

        }
    }

    public void countUneven(int x) {
        for (int i = 0; i < 10; i++) {
            if(x % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}
