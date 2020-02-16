public class Zadata12 {
    public static void main(String[] arqs) {
        int x = 20123143;
        int d ;
        int c = 1;
        for (int i = x; i > 0; i = i / 1000) {

                d = i % 1000;

                System.out.printf(" %d ", d);

        }
    }
}
