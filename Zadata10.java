public class Zadata10 {
    public static void main(String[]arqs){
        int k=9291;
        int x=k;
        int s=0;
        while (x!=0){
            s +=x%10;
            x /=10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }
}
