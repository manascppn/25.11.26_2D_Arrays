import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("Enter value to find: ");
        int t = sc.nextInt();
        int r = -1, c = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == t && r == -1) {
                    r = i;
                    c = j;
                }
            }
        }

        if (r != -1) {
            System.out.println("Found at row " + r + ", column " + c);
        } else {
            System.out.println("Not found");
        }
    }
}