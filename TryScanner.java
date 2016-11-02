import java.util.*;

/**
 * Created by Zhanat on 02.11.16.
 */
public class TryScanner {
    public static void main(String[] args) {
        // Try int Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int b = sc.nextInt();

        System.out.println("Вернем его вам: ");
        System.out.println(b);


       //  Try String Line Scanner

        Scanner aa = new Scanner(System.in);
        System.out.println("Введите строку текста.");
        String bb = aa.nextLine();   // если без Line(); - вернет текст до пробела

        System.out.println("Вернем её вам: ");
        System.out.println(bb);
    }
}