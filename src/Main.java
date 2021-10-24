import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        show();
        Scanner in = new Scanner(System.in);
        int flag = in.nextInt();
        do {
            switch (flag) {
                case 1:
                    Level1.lv1();
                    break;
                case 2:
                    Level2.lv2();
                    break;
                case 3:
                    Level3.lv3();
                    break;
                case 4:
                    Level4.lv4();
                    break;
                case 5:
                    Level5.lv5();
                    break;
            }
            show();
            flag = in.nextInt();
            show();
        } while (flag != 0);
    }


    public static void show() {
        System.out.println("输入数字");
        System.out.println("1:lv1");
        System.out.println("2:lv2");
        System.out.println("3:lv3");
        System.out.println("4:lv4");
        System.out.println("5:lv5");
        System.out.println("0:exit");
    }
}
