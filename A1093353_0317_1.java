import java.util.Scanner;

public class A1093353_0317_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("請輸入 n：");
        int n = scanner.nextInt();

        System.out.print("請輸入 m：");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = i * j;
            }
        }

        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
