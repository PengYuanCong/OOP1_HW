import java.util.*;
public class A1093353_0224_2{
    public static void main(String[] args) {
        testWeather();
    }
    static void testWeather(){
        int i,j;
        System.out.println("請輸入攝氏溫度:");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        j = (i - 32) * 5/9 ;
        System.out.println("華氏溫度為:" +j );
    }
}
