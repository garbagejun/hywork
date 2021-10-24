import java.util.Scanner;

public class Level5 {
    public static void lv5() {
        MutableArraylist list = new MutableArraylist();
        list.add("红岩网校冲冲冲");
        list.delete(0);
        list.add(0, "加油冲冲冲");
        System.out.println(list.get(0));
        System.out.println("list有" + list.size() + "个元素");
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
        if (size == elementDate.length) {
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
        for (int i = size - 1; i >= index; i--) {
            if (i == 0){
                break;
            }
            elementDate[i - 1] = elementDate[i];
        }
        size--;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(elementDate[i]);
        }
    }

    public void delete(Object index) {
        for (int i = 0; i < size; i++) {
            if (index == elementDate[i]) {
                delete(i);
                break;
            } else {
                System.out.println("没有找到指定元素");
            }
        }
    }

    public void add(int index, Object a) {
        if (size == elementDate.length) {
            this.resize(elementDate.length + 1);
        }
        for (int i = size - 1; i >= index; i--) {
            elementDate[i + 1] = elementDate[i];
        }
        for (int i = 0; i < elementDate.length; i++) {
            System.out.println(elementDate[i]);
        }
        elementDate[index] = a;
        size++;
    }

    public int size() {
        return size;
    }
}
