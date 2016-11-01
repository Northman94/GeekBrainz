/*
 *  Zhanat - ничего не менял. разобрался болеее менее с логикой и порядком выполнения
 */

// Homework № 3

import java.util.*;

class TicTacToe {
// char - потому что это единственный тип данных
// который начинается с нуля
// final - обозначает что данная переменная является константой

    // создание разных ячеек поля
    final char PLAYER_DOT = 'X';
    final char AI_DOT = 'O';
    final char EMPTY_DOT = '*';
    final int FIELD_SIZE = 3;

    // массив игрового поля
    char[][] field = new char[FIELD_SIZE][FIELD_SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) // без этой строки не будет возможности запуска
    {
        new TicTacToe().go(); // без неё код запустится, но ничего не будет делать.
        // скорее всего это ссылка на блок игрового цикла
    }
//////////////////////////////////////////////////

    // Блок игрового цикла
    void go()
    {
        initField();    // Заполняет поле поле *
        printField();  // Выводит готовое поле в консоль
        while (true)
        {
            turnPlayer();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("You won!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Sorry draw...");
                break;
            }
            turnAI();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("AI won!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Sorry draw...");
                break;
            }
        }
    }
  //////////////////////////////////////////////////////
        // Метод хода Игрока
    void turnPlayer() {
        int x, y;
        do
        { // (- 1) нужен чтоб сделать отчёт с нуля, а не с единицы
            System.out.println("Enter coordinates X Y (from 1 to "+FIELD_SIZE+"):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        field[x][y] = PLAYER_DOT;
    }
    // Метод хода AI через рандомную генерацию чисел
    // в границах размера поля
    void turnAI() {
        int x, y;
        do {
            x = rand.nextInt(FIELD_SIZE);
            y = rand.nextInt(FIELD_SIZE);
        } while (!isCellEmpty(x, y));
        field[x][y] = AI_DOT;
    }
////////////////////////////////////////////////////////
    boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > FIELD_SIZE - 1 || y > FIELD_SIZE - 1) return false; // условие расположения в границах поля
        if (field[x][y] == EMPTY_DOT) return true;
        return false;
    }
// Проверка на ничию по причине заполнености всех клеток
// и отсутствия победной комбинации
    boolean isFieldFull() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++)
                if (field[i][j] == EMPTY_DOT) return false;
        return true;
    }
////////////////////////////////////////////////////////
    boolean checkWin(char ch) {
        // проверка по горизонтали
        if (field[0][0] == ch && field[0][1] == ch && field[0][2] == ch) return true;
        if (field[1][0] == ch && field[1][1] == ch && field[1][2] == ch) return true;
        if (field[2][0] == ch && field[2][1] == ch && field[2][2] == ch) return true;
        // проверка по вертикали
        if (field[0][0] == ch && field[1][0] == ch && field[2][0] == ch) return true;
        if (field[0][1] == ch && field[1][1] == ch && field[2][1] == ch) return true;
        if (field[0][2] == ch && field[1][2] == ch && field[2][2] == ch) return true;
        // проверка по диагонали
        if (field[0][0] == ch && field[1][1] == ch && field[2][2] == ch) return true;
        if (field[2][0] == ch && field[1][1] == ch && field[0][2] == ch) return true;
        return false;
    }
/////////////////////////////////////////////////////////

    // Этот метод перебирает все координаты поля в массиве и присваивает *
    void initField() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++)
                field[i][j] = EMPTY_DOT;
    }

    // Этот метод выводит готовое поле в консоль и обновляет после хода
    void printField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++)
                System.out.print(field[i][j]);
            System.out.println();
        }
    }
}
