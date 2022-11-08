package module2.t01.t07;

import java.util.Scanner;

/**
 * Написать программу, которая находит корень линейного уравнения:
 * ax + b = 0
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        if ((a != 0) && (b != 0)) {
            int result = -(b / a);
            System.out.println("x = " + result);
        } else if ((a == 0) && (b != 0)) {
            System.out.println("Уравнение не имеет корней");
        } else if ((a == 0) && (b == 0)) {
            System.out.println("Ответ: любое число!");
        }
    }
}
