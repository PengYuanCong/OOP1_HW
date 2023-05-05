import java.util.*;
public class A1093353_0421_2 {
    public static void main(String[] args){
        int year, month, day;
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入日期 (YYYY/MM/DD 或 MM/DD/YYYY): ");
        String dateStr = input.nextLine();

        String[] dateParts = dateStr.split("/");
        if (dateParts.length != 3) {
            System.out.println("日期輸入格式錯誤！");
            return;
        }

        if (dateParts[0].length() == 4) {
            year = Integer.parseInt(dateParts[0]);
            month = Integer.parseInt(dateParts[1]);
            day = Integer.parseInt(dateParts[2]);
        } else {
            month = Integer.parseInt(dateParts[0]);
            day = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        }

        System.out.println("日期格式為: " + year + "/" + month + "/" + day);
        System.out.println("你所輸入的日期是: " + year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day));
    }
}