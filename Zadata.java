public class Zadata {
    public static void main(String[]args){
        int s=343700;
        int sec;
        int m;
        int sut;
        int min,h;
        int ned;
        sec=s%60;
        System.out.println("СЕКУНД"+sec);
        m=(s-sec)/60;
        min=m%60;
        h=(m-min)/60;
        sut=h%24;
        ned=sut%7;
        System.out.println(h+"часов"+min+"минут"+sec+"секунд"+sut+"суток"+ned+"недель");
    }
}
