import java.util.Scanner;

public class Level2 {
    int x[] = {40, 70, 60, 55, 80, 20};

    public static int[] bubbleSort(int[] x) {
        System.out.print("bubbleSort:");
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        return x;
    }

    public static void selectionSort(int x[]) {
        System.out.print("selectionSort:");
        for (int i = 0; i < x.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[minimum]) {
                    minimum = j;
                }
                if (i != minimum) {
                    int temp = x[i];
                    x[i] = x[minimum];
                    x[minimum] = temp;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

    }

    public static void lv2() {
        int x[] = {40, 70, 60, 55, 80, 20};
        selectionSort(x);
        x = bubbleSort(x);
        System.out.println("请输入要插入的数据");
        int c = new Scanner(System.in).nextInt();
        int[] x2 = new int[x.length + 1];
        for (int i = 0; i < x.length; i++) {
            x2[i] = x[i];
        }
        x2[x2.length-1] = c;
        System.out.println("数据插入后经过选择排序");
        selectionSort(x2);
    }

}

