package module4.t01.t02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Выведите на экран сумму четных элементов массива.
 * <p>
 * Если в массиве нет четных элементов, выведите "NO".
 * <p>
 * Например:
 * <p>
 * Input	        Result
 * 6
 * 1 2 3 4 5 6	    12
 * 5
 * 9 7 5 3 1	    NO
 */
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int size = a.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите элемент массива");
            numbers[i] = a.nextInt();
        }

        List<Integer> pos = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                pos.add(numbers[i]);
            }
        }
        int sumPos = 0;

        for (int i = 0; i < pos.size(); i++) {
            sumPos += pos.get(i);
        }

        if (sumPos != 0) {
            System.out.println("Сумма четных элементов массива = " + sumPos);
        } else {
            System.out.println("NO");
        }

    }
}
