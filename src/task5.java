public class task5 {
    public static void main(String[] args) {
        int[][] a = {
                {12, 5, 28, 3},
                {19, 7, 15, 9},
                {2, 30, 6, 11}
        };
        int max = a[0][0];
        int min = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) max = a[i][j];
                if (a[i][j] < min) min = a[i][j];
            }
        }
        System.out.println("Smallest: " + min);   // 2
        System.out.println("Largest: " + max);    // 30
    }
}