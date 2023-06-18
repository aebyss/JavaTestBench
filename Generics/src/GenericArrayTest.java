public class GenericArrayTest <T>  {

    // geht nicht T[] x = new T[10];


    T[] data = (T[]) new Object[10]; //geht aber nicht type secure

    T[] getX() {
        return data;
    }

    public static void main(String[] args) {
        GenericArrayTest<Integer> s = new GenericArrayTest<Integer>();

        Number [] n = s.getX();

        n[0] = 5.0f;
    }

}
