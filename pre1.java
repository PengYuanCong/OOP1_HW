import java.util.*;

public class pre1 {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("請輸入奇數起始值");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.println("請輸入奇數結束值");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();
        if (a % 2 != 1 || b % 2 != 1 || a > b){
            System.out.println("請重新輸入");
        }
        System.out.println("請輸入偶數起始值");
        Scanner sc3 = new Scanner(System.in);
        c = sc3.nextInt();
        System.out.println("請輸入偶數結束值");
        Scanner sc4 = new Scanner(System.in);
        d = sc4.nextInt();
        if (c % 2 != 0 || d % 2 != 0 || c > d){
            System.out.println("請重新輸入");
        }
            for ( int i = a ; i <= b ; i += 2 ){
                for (int j = c ; j <= d ; j += 2){
                    System.out.printf("%d * %d = %d\t" ,i,j,i*j);
                }
                System.out.println();
            }
    }
}
