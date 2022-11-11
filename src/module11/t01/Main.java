package module11.t01;

import java.io.IOException;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
////        int x;
////        int y;
////        System.out.println("Введите число:");
////        try {
////            x = System.in.read();
////            y = System.in.read();
////            System.out.println("Сумма = " + (x + y));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//////        System.out.println("Введите 2 число:");
//////        try {
//////            y = System.in.read();
//////        } catch (IOException e) {
//////            e.printStackTrace();
//////        }
//////
////    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            try {
                int sum = x + y;
                System.out.println("Сумма = " + sum);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

