import java.util.Scanner;

public class Level4 {
    public static void lv4() {
        Canteen canteen = new Canteen("“国民饭店”");
        int sum = 0;
        Scanner in = new Scanner(System.in);
        Menu[] m = new Menu[5];
        Menu m1 = new Menu("宫保鸡丁", 1, 38);
        Menu m2 = new Menu("鱼香肉丝", 2, 36);
        Menu m3 = new Menu("水煮肉片", 3, 34);
        Menu m4 = new Menu("干锅排骨", 4, 32);
        Menu m5 = new Menu("糖醋里脊", 5, 30);
        m[0] = m1;
        m[1] = m2;
        m[2] = m3;
        m[3] = m4;
        m[4] = m5;
        canteen.hello();
        m1.showMenu(m);
        System.out.println("请输入想要点的菜的序号(空格键分割)");
        String s = in.nextLine();
        System.out.println("你一共选择了");
        String s1[] = s.split(" ");
        int[] s2 = new int[s1.length];
        for (int i = 0; i < s2.length; i++) {
            s2[i] = s1[i].charAt(0) - '0';
        }
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (s2[i] == m[j].getNumber()) {
                    m[j].show();
                    sum += m[j].getPrice();
                }
            }
        }
        System.out.println("共计" + sum + "元");
        canteen.modeOfPayment();
        System.out.println("支付成功");
    }
}

class Menu {
    public String dishName;
    private int number;
    private int price;


    public Menu(String dishName, int number, int price) {
        this.dishName = dishName;
        this.number = number;
        this.price = price;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public String getDishName() {
        return dishName;
    }

    public void show() {
        System.out.println(this.getNumber() + " " + this.getDishName() + " " + this.getPrice());
    }

    public void showMenu(Menu[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].getNumber() + " " + m[i].getDishName() + " " + m[i].getPrice());
        }
    }
}


class Canteen {
    private String canteenName;

    public Canteen(String canteenName) {
        this.canteenName = canteenName;
    }

    public void setCanteenName(String canteenName) {
        this.canteenName = canteenName;
    }

    public String getCanteenName() {
        return canteenName;
    }

    public void modeOfPayment() {
        Scanner in = new Scanner(System.in);
        System.out.println("请选择支付方式");
        System.out.println("1.支付宝");
        System.out.println("2.微信");
        System.out.println("3.人脸识别");
        System.out.println("3.一卡通");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("请出示二维码");
                break;
            case 2:
                System.out.println("请出示二维码");
                break;
            case 3:
                System.out.println("请把脸对准摄像头");
                break;
        }
    }

    public void hello() {
        System.out.println("欢迎光临" + canteenName + ",这是今天的菜单");
    }
}
