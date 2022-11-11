package module10.t01.t03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] strs = new String[]{"One", "Two", "Three"};
        // Access to the element at index 0.
        String str1 = strs[0];

        //System.out.println("String at 0 = " + str1);

        //исключение ArrayIndexOfBoundException
        try {
            String str2 = strs[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        int myArray[] = null;
        try {
            System.out.println(myArray[5]);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
