package module2.t01.t03;

import java.util.Scanner;

/**
 * Дано целое число n. Выведите следующее за ним четное число.
 * При решении этой задачи нельзя использовать условную инструкцию if и циклы.
 * Входные данные
 * Вводится натуральное число.
 * Выходные данные
 * Выведите ответ на задачу.
 *
 * For example:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    7       |   8       |
 * --------------------------
 * |    8       |   10      |
 * --------------------------
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nВведите натуральное число: ");

        // Define and initialize variable 'x'
        // Объявление и инициализация переменной 'x'
        int x = in.nextInt();

        int i = x + (int) Math.pow(2, (x + 1) % 2);

        System.out.println("следующее четное число = "  + i);
    }
}
