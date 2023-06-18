public class ZweiDimCopy {
    public static void main(String[] args) {
        int [][] x = {{1, 2, 3,}, {2, 3, 4}, {4, 5, 6}};

        int [][] y = new int[3][3];

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x.length; j++) {
                y[i][j] = x[i][j];
            }
        }

        System.out.println(y);
    }
}
