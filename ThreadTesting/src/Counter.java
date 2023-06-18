public class Counter {
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public void increase(int number) {
        this.number = number++;
        System.out.println(this.number);
    }

    public void decrease(int number) {
        this.number = number--;
        System.out.println(this.number);
    }
}
