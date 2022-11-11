package module10.t01.t02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream("C:\\Temp\\1.txt");
            while (fileStream.available() > 0) {
                int b = fileStream.read();
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileStream != null) {
                try {
                    fileStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
