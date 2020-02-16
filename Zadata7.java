public class Zadata7 {
    public static void main(String[]aqrs){
        int a=5;
        int b=10;
        int c=6;
        int d=12;
        int e=7;
        int f=14;
        double dom1,dom2,yts;
        dom1=Math.sqrt(a*a+b*b);
        dom2=Math.sqrt(c*c+d*d);
        yts=Math.sqrt(e*e+f*f);
        if(dom1>yts){
            System.out.println("Первый дом не помещается на участке");
        }else if (dom1<yts){
            System.out.println("Первый дом  помещается на участке");
        }
        if(dom2>yts){
            System.out.println("Второй дом не помещается на участке");
        }else if (dom2<yts){
            System.out.println("Второй дом  помещается на участке");
        }

    }
}
