public class MoreTypes <T, U, V> {
    T content0;
    U content1;
    V content2;

    public MoreTypes(T t, U u, V v) {
        content0 = t;
        content1 = u;
        content2 = v;
    }

    public static void main(String[] args) {
        MoreTypes<String, Integer, Double> mt = new MoreTypes<>("String", 22, 2.0);


    }
}
