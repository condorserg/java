package module11.t01.t03;

import module6.t01.t04.Goods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Ivan", "Ivanov", "8912123456789", 40);
        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("C:\\Temp\\user.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // сохраняем в файл
        try {
            objectOutputStream.writeObject(user1);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




