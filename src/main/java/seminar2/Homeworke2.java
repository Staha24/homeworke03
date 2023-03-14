package seminar2;

import java.io.FileWriter;

public class Homeworke2 {
    public static void main(String[] args) {
        System.out.println(isPolindrome("lobolr"));
        Test();
    }
    public static boolean isPolindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    //Напишите метод, который составит строку из 100 повторений слова TEST  и мтод,
//который запишет эту строку в простой текстовый файл, обработайте исключения.
    public static void Test(){
        StringBuilder sb = new StringBuilder();
        sb.append("Test". repeat(100));
        System.out.println(sb);
        try {
            FileWriter f1 = new FileWriter("test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
        }catch (Exception e){
            System.out.println("FAIL");
        }
    }
}
//Напмшмте метод, который выведет содержание папки в виде массива строк
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл
//Обработайте ошибки с помощью try-catch конструкции.В случае возникновения исключения, оно должго записаться в лог-файл.

