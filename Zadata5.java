public class Zadata5 {
    public static void main(String[]aqrs){
        int x=149;
        if(x%10==1){
            System.out.println("Рубль "+x);
        }
        else if(x%10==2 || x%10==3 || x%10==4){
            System.out.println("Рубля "+x);
        }
        else if(x%10==5 || x%10==6 || x%10==7 || x%10==8 || x%10==9){
            System.out.println("Рублей "+x);
        }
    }
}
