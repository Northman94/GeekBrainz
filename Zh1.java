/**
 * Created by Zhanat on 06.10.16.
 */
public class Zh1 {
    public static void main(String[] args)

    {
        {

            long t = 3436L;
            byte y = 126;
            char u = 600;
            short i = -30;
            int o = 1;
            boolean f = true;
            float g = 3.4f;
            double p = 5.66;
        }

        int a = 5;
        int b = 10;
        int c = 40;
        int d = 10;

        int h = a * (b + (c / d));
        System.out.println("a * (b + (c / d)) = " + h);


        {
            int num1 = 10;
            int num2 = 5;
            int w = num1 + num2;

            if (w >= 10 && w <= 20)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

        {
            /*
            // Дополнительное задание - Высокосный год
            //Ощибка в том что логические операторы использ
            // только с boolean
            
            float year;
            year = 2016;
            
            if (year % 100) & (year % 400)
            {
                System.out.println("Leap Year");
            }
            else(year % 4) | (year % 400)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Ordinary Year");
            }
            year++;
            */
        }


    }
}
