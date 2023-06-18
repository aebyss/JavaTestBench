public class Rekursion {
    public static long anzahlMoglichkeiten(long n, long k) {
        if(n == k || k == 0) {
            return 1;
        } else {
            return n * anzahlMoglichkeiten(n-1, k-1) / k;
        }
    }

    public static void main(String[] args) {
        System.out.println(anzahlMoglichkeiten(5, 3));
    }
}
