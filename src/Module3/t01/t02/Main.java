package Module3.t01.t02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число и проверить,
 * принадлежит ли это число диапазону от N до M (включительно).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        int n = 0;
        int m = 10;

        if ((a >= n) && (a <= m)){
            System.out.println("Число " + a + " принадлежит диапазону от " + n + " до " + m);
        } else {
            System.out.println("Число " + a + " не принадлежит диапазону от " + n + " до " + m);
        }


    }
}
