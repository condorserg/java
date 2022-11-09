package module4.t01.t04;

import java.util.Scanner;

/**
 * Вывести на экран значение самого часто повторяющегося элемента массива и число повторений.
 * <p>
 * Если в массиве несколько таких элементов,
 * вывести из них тот, который имеет самый меньший номер.
 * <p>
 * For example:
 * <p>
 * Input	Result
 * 6
 * 1 2 3 1 2 1	    1 (3)
 * 5
 * 10 20 30 40 50	   10 (1)
 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите кол-во элементов");
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] d = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();// Заполняем массив числами
        }
        for (int i = 0; i < a.length; i++) {
            int num = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) num++; // Находим сколько раз каждое число встречается в массиве
            }
            b[i] = num;
        }

        int numB = 0;
        for (int k : b) {

            if (k == 1) numB++; // Если весь массив равен 1, то все элементы различны
        }

        if (numB == b.length) System.out.println("Повторяющиеся элементы отсутствуют");

        else {
            int max = b[0];
            int c = 0;
            for (int i = 0; i < b.length; i++) {
                if (max < b[i]) {
                    max = b[i];
                    c = i;
                } // Находим максимальное количество повторяющихся элементов
            }
            int numMax = 0;
            for (int j : b) {
                if (max == j) {
                    numMax++;
                }// Находим количество максимально повторяющихся элементов
            }
            if (numMax == 1) { // Если их количество равно 1 ,то одно число повторяется максимальное кол-во раз
                System.out.println("Число " + a[c] + " встречается " + max + " раза"); // Выводим это число
            } else {
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == max) {
                        d[i] = a[i];
                    }// Если таких элементов несколько ,то заполняем новый массив D этими элементами
                }

                int min = d[0];
                c = 0;
                for (int i = 0; i < d.length; i++) {

                    if (min > d[i] && d[i] != 0) {
                        min = d[i];
                        c = i;
                    }// Находим в массиве D минимальное число
                }
                System.out.println("Число " + min + " встречается " + max + " раза"); // Выводим мин. номер массиве

            }
        }
    }
}
