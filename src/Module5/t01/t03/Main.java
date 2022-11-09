package Module5.t01.t03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Применяя pattern-match выполните распознавание строк для простого тестирования:
 * <p>
 * Формат теста:
 * ---------------------/
 * ? Вопрос
 * + Вариант ответа 1
 * - Вариант ответа 2
 * - Вариант ответа 3
 * - Вариант ответа 4
 * ---------------------/
 * <p>
 * Каждый вопрос начинается с символа '?'
 * Каждый вариант ответа с '+' или '-', что соотвествует правильному и неверному ответу
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите E-mail: ");
        String email = scanner.nextLine();


        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        System.out.println(email + " : " + matcher.matches());
    }
}
