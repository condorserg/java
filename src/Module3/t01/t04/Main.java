package Module3.t01.t04;

import java.util.Scanner;

/**
 * Показать модуль введённого числа.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Модуль числа " + a + " = " + Math.abs(a));

    }
}
