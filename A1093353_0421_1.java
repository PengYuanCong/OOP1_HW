import java.io.*;
public class A1093353_0421_1 {
    public class EmailValidator {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
            System.out.println("請輸入使用者的電子郵件:");
            String email = reader.readLine();
    
            if (isValidEmailAddress(email)) {
                System.out.println("此電子郵件地址符合格式");
            } else {
                System.out.println("此電子郵件地址不符合格式");
            }
        }
    
        public static boolean isValidEmailAddress(String email) {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                                "[a-zA-Z0-9_+&*-]+)*@" +
                                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    
            return email.matches(emailRegex);
        }
    }
}