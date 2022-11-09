package module4.t01.t06;

import java.util.Scanner;

/**
 * Написать программу для проведения минимального тестирования при помощи массивов:
 * <p>
 * Вопросы - варианты ответов
 * <p>
 * Вопрос1:
 * Вариант 11
 * Вариант 12
 * Вариант 13
 * Вариант 14
 * <p>
 * Вопрос2:
 * Вариант 21
 * Вариант 22
 * Вариант 23
 * Вариант 24
 * <p>
 * Предусмотреть идентификатор корректности для каждого варианта
 * <p>
 * Выставить оценку по 5-бальной системе
 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        // массив с правильными ответами
        int[] arrCorrectAnswers = new int[]{1, 3, 2};
//
        int[] arrAnswers = new int[3];
        //массив на 3 строки
        String[][] questions = new String[3][];

        questions[0] = new String[]{"Вопрос1:", "Вариант 1", "Вариант 2", "Вариант 3", "Вариант 4"};
        questions[1] = new String[]{"Вопрос2: ", "Вариант 1", "Вариант 2", "Вариант 3", "Вариант 4"};
        questions[2] = new String[]{"Вопрос3: ", "Вариант 1", "Вариант 2", "Вариант 3", "Вариант 4"};

        //на экран
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                System.out.print(" " + questions[i][j] + " ");
            }
            System.out.println("\nВведите номер ответа на вопрос: ");

            arrAnswers[i] = s.nextInt();

        }
        System.out.println("Номера ответов: ");
        for (int i = 0; i < arrAnswers.length; i++) {
            System.out.print(arrAnswers[i] + " ");
        }


        //сравнение ответов
        int correctAnswersCount = 0;
        for (int i = 0; i < arrAnswers.length; i++) {
            if (arrAnswers[i] == arrCorrectAnswers[i]) {
                correctAnswersCount = correctAnswersCount + 1;
            }
        }
        System.out.println("\nКол-во правильных ответов: " + correctAnswersCount);

        if (correctAnswersCount == 3) {
            System.out.println("\nОценка: 5");
        }
        if (correctAnswersCount == 2) {
            System.out.println("\nОценка: 4");
        }
        if (correctAnswersCount == 1) {
            System.out.println("\nОценка: 3");
        }
        if (correctAnswersCount == 0) {
            System.out.println("\nОценка: 2");
        }
    }
}

