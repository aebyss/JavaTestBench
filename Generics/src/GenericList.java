public class GenericList<T> {
    private final int SIZE = 10;
    private T[] data = (T[]) new Object[SIZE]; //works aber es ist ein workaround
    private int index = 0;

    //private T[] newData = new T[SIZE]; cant be instantiated


    public void add(T x) {
        if(index < SIZE) {
            data[index++] = x;
        }
    }

    public T remove() {
        if (index > 0) {
            return data[--index];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        GenericList<Integer> ilist = new GenericList<Integer>();
        ilist.add(1);
        ilist.add(2);
        System.out.println(ilist.remove());
        System.out.println(ilist.remove());
        System.out.println(ilist.remove());

        GenericList<String> slist = new GenericList<>();
        slist.add("1");
        slist.add("2");
        slist.add("3");

        System.out.println(slist.remove());
        System.out.println(slist.remove());
        System.out.println(slist.remove());

    }
}
