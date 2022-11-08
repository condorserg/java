package Module3.t01.t05;

import java.util.Scanner;

/**
 * Вводится целое число (не более 4 разрядов!).
 * Определить количество цифр в нём.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число (не более 4 разрядов!): ");
        int a = scanner.nextInt();

        if ((a % 10) == a) {
            System.out.println("1 цифра");
        } else if ((a % 100) == a) {
            System.out.println("2 цифры");
        } else if ((a % 1000) == a) {

            System.out.println("3 цифры");
        } else if ((a % 10000) == a) {
            System.out.println("4 цифры");
        }
    }
}
