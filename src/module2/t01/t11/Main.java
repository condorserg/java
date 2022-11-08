package module2.t01.t11;

import java.util.Scanner;

/**
 * Поменять местами значения переменных a и b,
 * сначала с использованием дополнительной третьей переменной, а затем – без
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + "," + "b = " + b);
        // вариант 2
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "," + "b = " + b);
    }

}
