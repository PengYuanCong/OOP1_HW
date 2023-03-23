import java.util.*;
public class pre2 {
    public static void main(String[] args) {
        int num = 0;
        int TotalCost = 0;
        int ticket = 2000;
        
        System.out.println("請輸入平均售票張數:");
        Scanner sc1 = new Scanner(System.in);
        num = sc1.nextInt();

        System.out.println("請輸入總成本花費:");
        Scanner sc2 = new Scanner(System.in);
        TotalCost = sc2.nextInt();
        switch(ticket*num){
            case 1:
            System.out.println("總收入的金額:");
            System.out.printf("%d*%d=%d",ticket,num);
            case 2:
            if(ticket*num/TotalCost > 0.35){
                System.out.println("嗯!明年續辦");
            }
            case 3:
            if(TotalCost/(ticket*num) > 0.2){
                System.out.println("虧死了!明年停辦");
                }
            case 4:
            if(ticket*num/TotalCost < 0.35 && TotalCost/(ticket*num) < 0.2){
                System.out.println("獲利(虧損)百分比為:");

            }
            }

        }
}

