package module10.t01.t04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File fileObj = new File("Test.txt");

            PrintWriter printWriter1 = new PrintWriter(new FileWriter(fileObj), true);
            //запись текста в файл
            printWriter1.println("TEST");
            printWriter1.close();
            // делаем файл readonly
            fileObj.setReadOnly();
            //пытаемся снова записать
            PrintWriter printWriter2 = new PrintWriter(new FileWriter("Test.txt"), true);
            printWriter2.println("TEST2");
            printWriter2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}