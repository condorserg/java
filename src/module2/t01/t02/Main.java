package module2.t01.t02;

import java.util.Scanner;

/**
 * С клавиатуры вводится двузначное натуральное число.
 * Вывести на экран количество десятков в нем.
 * <p>
 * For example:
 * Например:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    45      |   4       |
 * --------------------------
 */

public class Main {
    public static void main(String[] args) {
        // Define and initialize variable 'in'
        // Объявление и инициализация переменной 'in'
        Scanner in = new Scanner(System.in);

        System.out.print("\nВведите целое число: ");

        // Define and initialize variable 'x'
        // Объявление и инициализация переменной 'x'
        int x = in.nextInt();

        // Define and initialize variable 'result'
        // Объявление и инициализация переменной 'result'
        int result = x / 10;

        // Show result
        // Вывод результата
        System.out.println("количество десятков числа " + x + " равен " + result);
    }
}