package module2.t01.t04;

import java.util.Scanner;

/**
 * Стоимость покупки
 * Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
 * Входные данные
 * Программа получает на вход три числа: a, b, n.
 * Выходные данные
 * Программа должна вывести два числа: стоимость покупки в рублях и копейках.
 *
 * For example:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    10      |   20 30   |
 * |    15      |           |
 * |    2       |           |
 * --------------------------
 * |    2       |   10  0   |
 * |    50      |           |
 * |    4       |           |
 * --------------------------
 */
public class Main {
    public static void main(String[] args) {
        Scanner rub = new Scanner(System.in);
        Scanner cop = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.print("\nВведите рубли: ");
        int a = rub.nextInt();
        System.out.print("Введите копейки: ");
        int b = cop.nextInt();
        System.out.print("Введите кол-во пирожков: ");
        int n = num.nextInt();

        int sum = (a * 100 + b) * n;
        int sumrub = sum /100;
        int sumcop = sum % 100;

        System.out.println("Сумма:" + sumrub + " руб." + ", " + sumcop + " коп.");


    }
}
