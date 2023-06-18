public class MittelWertArray {


    public static void main(String[] args) {

        int [] a = new int[5];
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = i;
            sum += a[i];
        }
        System.out.println(sum);
        int mittelwert = sum / a.length;

        System.out.println(mittelwert);
    }
}
