public class extra1 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
                {5, 5, 5, 5}
        };
        int bestRow = 0, bestSum = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            if (i == 0 || sum > bestSum) {
                bestSum = sum;
                bestRow = i;
            }
        }
        System.out.println("Row " + bestRow + " has the largest sum: " + bestSum);
    }
}