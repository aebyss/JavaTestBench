public class GenericToAddTwoNumbers {

    static <T extends Number, V extends Number> double methode(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(methode(2, 4));
    }

}
