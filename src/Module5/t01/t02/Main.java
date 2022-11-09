package Module5.t01.t02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Используя форматирование времени и даты примените шаблон вывода:
 *
 * 2022-01-15 20:22:33
 *
 */
public class Main {
    public static void main(String[] args) {

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss ");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));

    }
}
