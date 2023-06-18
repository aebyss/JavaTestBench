public class Counter {

    int count;

    static int idCounter = 0;
    int id;

    public Counter() {
        id = ++idCounter;
    }

    public synchronized void inc() {
        count = count + 1;
    }

    public synchronized void dec() {
        count = count - 1;
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized String toString() {
        return String.format("%d : %d", id, count);
    }

}
