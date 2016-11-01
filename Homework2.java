/**
 * Created by Zhanat on 14.10.16.
 */
public class Homework2 {
    public static void main(String[] args) {

        // Задание 1

            int massive[] = {1, 0, 0, 1, 0, 1, 1, 0, 1, 1};


        // Задание 2
        // В массиве из предыдущего пункта с помощью цикла
        // заменить 0 на 1, 1 на 0;
        {
            int numbs[] = {1, 0, 0, 1, 0, 1, 1, 0, 1, 1};

            for (int i = 0; i < numbs.length; i++) {

                if (numbs[i] == 1) numbs[i] = 0;
                else numbs[i] = 1;
                System.out.print(numbs[i]);
            }
        }

        // Задание 3
        // Создать массив из 8 целых чисел.
        // С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;

            int assign[] = new int[8];

            for (int a = 0; a < 8; a++)
            {
                assign[a] = (a * 3) + 1;

                System.out.println(assign[a] + "\n");
            }

        System.out.println("\n");


        // Задание 4 - пройти по массиву циклом, и числа,
        // которые меньше 6, умножить на 2.

        {
            int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int z = 0; z < 12; z++) {
                if (mas[z] < 6) mas[z] *= 2;

                System.out.println(mas[z]);
            }
        }
    }
}
