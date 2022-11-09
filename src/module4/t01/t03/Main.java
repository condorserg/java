package module4.t01.t03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Развернуть массив в обратную сторону ("задом наперед").
 * <p>
 * Последний элемент должен находится на месте начального и наоборот.
 * <p>
 * Не разрешается использовать дополнительный массив.
 * <p>
 * Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.
 * <p>
 * For example:
 * <p>
 * Input	            Result
 * 6
 * 1 2 3 4 5 6	        6 5 4 3 2 1
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

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Перевернутый массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
