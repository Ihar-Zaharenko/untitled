public class Zadata13_2 {
    public static void main(String[] arqs) {

        int x = 20;
        for (int i = 1; i <= x; i++) {
            for (int f = 2; f < i; f++) {
                if ( i%f==0) {
                    System.out.println("Простое"+i);
                    break;

                }


            }
        }
    }
}


