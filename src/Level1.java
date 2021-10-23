public class Level1 {
    public static void lv1() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > j) {
                    System.out.print(j + "*" + i + "=" + i * j + " ");
                } else {
                    System.out.print(i + "*" + j + "=" + i * j + " ");
                }
            }
            System.out.println();
        }
    }
    public static void lv1_puls(){

    }
}
