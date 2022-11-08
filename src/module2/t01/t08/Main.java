package module2.t01.t08;

import java.util.Scanner;

/**
 * Написать программу, которая  предоставляет пользователю возможность ввести с клавиатуры количество рублей, и переводит его в доллары и евро
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во рублей: ");
        double a = scanner.nextInt();

        double usd = a * 0.016;
        double eur = a * 0.016;

        System.out.println(a + "рублей = " + usd + " USD");
        System.out.println(a + "рублей = " + eur + " EUR");
    }
}
