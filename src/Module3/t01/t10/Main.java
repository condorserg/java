package Module3.t01.t10;

import java.util.Scanner;

/**
 * Введите с клавиатуры три целых числа.
 * Известно, что они различны между собой.
 * Выведите их на экран в порядке возрастания.
 * Не разрешается пользоваться функциями min/max и подобным им, а также оператором присваивания (за исключением ввода исходных чисел).
 * For example:
 * Input	Result
 * -8 7 12	-8 7 12
 * 157 2 85	2 85 157
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int a = scanner.nextInt();
        System.out.print("Введите 2 число: ");
        int b = scanner.nextInt();
        System.out.print("Введите 3 число: ");
        int c = scanner.nextInt();
        int x;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else a = a;
        if (b > c) {
            x = b;
            b = c;
            c = x;
        } else b = b;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else c = c;

        System.out.println("В порядке возрастания: " + a + ", " + b + ",  " + c);
    }
}
