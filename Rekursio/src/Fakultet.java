public class Fakultet {
    public static void main(String[] args) {
        System.out.println(fakultaet(3));
    }
    public static long fakultaet (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fakultaet(n - 1);
        }
    }
}
