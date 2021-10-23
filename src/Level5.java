import java.util.Scanner;

public class Level5 {
    public static void lv5() {
        MutableArraylist list = new MutableArraylist();
        int flag = 1;
        do {
            System.out.println("请选择使用的功能");
            System.out.println("1.添加一个元素给动态容器中");
            System.out.println("2.得到某个索引下的元素");
            System.out.println("3.删除某个索引下的元素");
            System.out.println("4.展示动态数组的元素");
            System.out.println("5.删除指定元素");
            System.out.println("6.在对应位置添加下标");
            System.out.println("7.退出程序");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("请输入要加入的元素");
                    String x = in.next();
                    list.add(x);
                    break;
                case 2:
                    System.out.println("请输入元素下标");
                    int c = in.nextInt();
                    System.out.println(list.get(c));
                    break;
                case 3:
                    System.out.println("请输入要删除元素的下标");
                    int d = in.nextInt();
                    list.delete(d);
                    break;
                case 4:
                    list.show();
                    break;
                case 5:
                    System.out.println("请输入要删除的元素");
                    Object r = in.next();
                    list.remove(r);
                case 6:
                    System.out.println("请输入要加入元素的下标");
                    int a = in.nextInt();
                    list.add(a);
                    break;
                case 7:
                    flag = 0;
                    break;
            }
        } while (flag == 1);
    }
}

class MutableArraylist {
    private Object[] elementDate;
    private int size = 0; //元素个数

    public MutableArraylist(int capacity) {
        elementDate = new Object[capacity];
    }

    //默认容量为1
    public MutableArraylist() {
        this(1);
    }

    //添加一个元素到数组中
    public void add(String add) {
        if (size== elementDate.length) {
            this.resize(elementDate.length + 1);
        }
        elementDate[size] = add;
        size++;
    }

    public void resize(int newCapacity) {
        Object[] newElementDate = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElementDate[i] = elementDate[i];
        }
        elementDate = newElementDate;
    }

    public Object get(int index) {
        return elementDate[index];
    }

    public void delete(int index) {
        for (int i = size; i > index; i--) {
            elementDate[i - 1] = elementDate[i];
        }
        size--;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementDate[i]);
        }
    }

    public void remove(Object index) {
        for (int i = 0; i < size; i++) {
            if (index == elementDate[i]) {
                delete(i);
                break;
            } else {
                System.out.println("没有找到指定元素");
            }
        }
    }

    public void add(int index) {
        if (size == elementDate.length) {
            this.resize(elementDate.length + 1);
        }
        for (int i = size - 1; i >= index; i--) {
            elementDate[i + 1] = elementDate[i];
        }
        for (int i = 0; i < elementDate.length; i++) {
            System.out.println(elementDate[i]);
        }
        System.out.println("请输入要加入的元素");
        String a = new Scanner(System.in).next();
        elementDate[index] = a;
        size++;
    }
}