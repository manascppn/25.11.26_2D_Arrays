import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("Enter a number: ");
        int t = sc.nextInt();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > t) count++;
            }
        }
        System.out.println("Values greater than " + t + ": " + count);
    }
}