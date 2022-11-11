package module10.t01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int a = in.nextInt();

        System.out.print("Введите 2 число: ");
        int b = in.nextInt();

//        int c;
        try {
            int c = a/b;
            System.out.println("Ответ: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деление на ноль!");
        }

    }
}
