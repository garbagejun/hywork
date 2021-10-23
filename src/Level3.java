import java.util.Scanner;
import java.util.Random;

public class Level3 {
    public static void getSymmetricMatrix(int[][] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = rd.nextInt(20) + 1;
                if (i > j) {
                    a[i][j] = a[j][i];
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
                if (a[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++) {
                int temp = 0;
                for (int k = 0; k < a.length; k++)
                    temp += a[i][k] * b[k][j];
                c[i][j] = temp;
            }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c;
    }

    public static void sumOfDiagonals(int[][] c) {
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (i == j) {
                    sum += c[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void lv3() {
        System.out.println(" 输入一个对称矩阵的行数和列数（行==列）");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("矩阵A");
        getSymmetricMatrix(a);
        System.out.println("矩阵B");
        getSymmetricMatrix(b);
        System.out.println("A*B");
        c = multiplyMatrix(a, b);
        System.out.println("对角线之和");
        sumOfDiagonals(c);
    }
}
