package Module3.t01;

import java.util.Scanner;

/**
 * Ввести число, и выяснить -
 * положительное оно, отрицательное, или равно нулю?
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Число: " + a + " - ноль");
        } else if (a % 2 == 0) {
            System.out.println("Число: " + a + " - четное!");
        } else {
            System.out.println("Число: " + a + " - НЕчетное!");
        }
    }
}
