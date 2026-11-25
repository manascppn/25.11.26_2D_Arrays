public class task12 {
    public static void main(String[] args) {
        int[][] g = {
                {80, 90, 70, 60},
                {50, 65, 75, 85},
                {95, 88, 92, 100}
        };
        int max = g[0][0];
        int total = 0;

        for (int i = 0; i < g.length; i++) {
            int sum = 0;
            for (int j = 0; j < g[i].length; j++) {
                sum += g[i][j];
                total += g[i][j];
                if (g[i][j] > max) max = g[i][j];
            }
            double avg = (double) sum / g[i].length;
            System.out.println("Student " + (i + 1) + " average: " + avg);
        }

        double overall = (double) total / (g.length * g[0].length);
        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overall);
    }
}