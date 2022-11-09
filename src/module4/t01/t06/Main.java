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

        // массив с правильными ответами
        int[] arrCorrectAnswers = new int[]{1, 3, 2};

        int[] arrAnswers = new int[3];

        System.out.println("Вопрос 1:\nВариант1\nВариант2\nВариант3\nВариант4");
        System.out.println("Введите номер ответа на вопрос 1: ");
        int answer1 = s.nextInt();
        if ((answer1 == 1) || (answer1 == 2) || (answer1 == 3) || (answer1 == 4)) {
            arrAnswers[0] = answer1;
        }

        System.out.println("Вопрос 2:\nВариант1\nВариант2\nВариант3\nВариант4");
        System.out.println("Введите номер ответа на вопрос 2: ");
        int answer2 = s.nextInt();
        if ((answer2 == 1) || (answer2 == 2) || (answer2 == 3) || (answer2 == 4)) {
            arrAnswers[1] = answer2;
        }

        System.out.println("Вопрос 3:\nВариант1\nВариант2\nВариант3\nВариант4");
        System.out.println("Введите номер ответа на вопрос 3: ");
        int answer3 = s.nextInt();
        if ((answer3 == 1) || (answer3 == 2) || (answer3 == 3) || (answer3 == 4)) {
            arrAnswers[2] = answer3;
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

