package module2.t01.t06;

import java.util.Scanner;

/**
 * Найти среднее арифметическое значение трёх вещественных чисел
 */
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        double a1 = a.nextInt();
        System.out.print("Введите 2 число: ");
        double b2 = b.nextInt();
        System.out.print("Введите 3 число: ");
        double c3 = c.nextInt();
        double res = (a1 + b2 + c3) / 3;

        System.out.println("Среднее арифметическое = " + res);
    }
}
