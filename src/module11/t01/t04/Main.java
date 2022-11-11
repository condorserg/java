package module11.t01.t04;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Вводим предложение
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine().toLowerCase(Locale.ROOT);

        String[] subStr = input.split(" "); // Разделения строки str с помощью метода split()

        System.out.println(Arrays.stream(subStr)
                .collect(groupingBy(Function.identity(),counting())));
    }
}