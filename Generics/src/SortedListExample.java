public class SortedListExample<T extends Comparable<T>> {
    private final int SIZE = 100;
    private T[] data = (T[]) new Comparable[SIZE];
    private int index = 0;
    

    public void add (T x) {
        if(index < SIZE) {
            int i = index - 1;
            while(i > 0 && data[i].compareTo(x) >= 0) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = x;
            index++;
        }
    }

    public T remove() {
        if(index > 0) {
            return data[--index];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        SortedListExample<Integer> sortList = new SortedListExample<>();

        sortList.add(7);
        sortList.add(4);
        sortList.add(0);
        sortList.add(3);

        System.out.println(sortList.remove());
        System.out.println(sortList.remove());
        System.out.println(sortList.remove());
        System.out.println(sortList.remove());

    }

}
