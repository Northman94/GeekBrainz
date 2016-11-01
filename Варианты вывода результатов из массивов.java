/**
 * Created by Zhanat on 13.10.16.
 */
import java.util.*;
// это нужно для Scanner

public class Zh2 {
    public static void main(String[] args) {


        // Варианты вывода результатов массивов


        int[] inumbers = {1, 0, 1, 1, 0, 1, 0, 1, 0, 0};

        for (int i = 0; i < 10; i++)
        {
            inumbers[i] = i;

            System.out.println(i);
        }


        { int cell[] = new int[10];
        int i;

        for (i = 0; i < 10; i++)
            cell[i] = i;

        for (i = 0; i < 10; i++)

            System.out.println("Sample [" + i + "]:" + cell[i]);
        }


            // Двумерный массив - отображатся так ибо у каждого числа есть
           // координаты в таблице и они подставляются в формулу
          // Подсчет по принципу 1-1; 1-2; 1-3; 1-4; 2-1; 2-2...4-4.

      int table[][] = new int[3] [4];
        int t, i;

        for (t = 0; t < 3; ++t)
        {
            for (i = 0; i < 4; ++i)
            {
                table[t] [i] = (t*4) +i+ 1;
                System.out.print(table[t][i] + "   ");
            }
            System.out.println();
        }
    }
}
