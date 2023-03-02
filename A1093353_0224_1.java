import java.util.*;
public class A1093353_0224_1{
    public static void main(String[] args) {
        testOddDouble();
    }
    
    static void testOddDouble(){
        int n;
        System.out.println("請輸入任意整數:");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        if(n % 2 == 0)
            System.out.println("此數為偶數");
        else
            System.out.println("此數為奇數");
    }
}