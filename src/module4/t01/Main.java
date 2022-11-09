package module4.t01;

import java.util.Scanner;

/**
 * В этой задаче нужно вводить с клавиатуры значения элементов массива.
 * <p>
 * Нужно заполнить значения элементов массива числами последовательности:
 * <p>
 * 4, 7, 10, 13, 16, ,,,
 * <p>
 * и вывести получившийся массив на экран.
 * <p>
 * Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран,
 * не попадая в массив.
 * <p>
 * Например:
 * <p>
 * Input	                    Result
 * 6
 * 4 7 10 13 16 19         { 4, 7, 10, 13, 16, 19 }
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.print("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            // Заполняем массив элементами
            array[i] = input.nextInt();
        }
        System.out.print("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(",  " + array[i]);
        }
    }
}
