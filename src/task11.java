public class task11 {
    public static void main(String[] args) {
        int[][] a = {{5, -3, 8}, {-1, 0, 12}, {-7, 4, -2}};

        System.out.println("Before:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) a[i][j] = 0;
            }
        }

        System.out.println("After:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}