public class WrapperTest {


    public static void main(String[] args) {
        Integer n1 = 20;
        Integer n2 = new Integer(20);
        Integer n3 = Integer.valueOf(20);
        Integer n4 = n1 + n2 - n3;
        System.out.println(n1 == n2);
        System.out.println(n1 == n3);
        System.out.println(n1 == n4);
        System.out.println(n2 == n4);
    }
}