public class Zadata4 {
    public static void main(String[]args){
        int a=4;
        int b=10;
        int r=2;
        int dk;
        int dp;
        double dpa;
        dp=a*a+b*b;
        dpa=Math.sqrt(dp);
        dk=r*2;
        if(dk>dpa){
            System.out.println("Отверстие полностью закрыто");
        }
        else {
            System.out.println("Отверстие закрыто не полностью");
        }
    }
}
