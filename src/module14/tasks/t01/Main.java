package module14.tasks.t01;

import module8.t01.Car;

import java.util.*;

public class Main {

public static void main(String[] args) {

    Car lada = new Car("Priora", "url",100, 200);
    Car mercedes = new Car("Benz", "url",300, 200);
    Car bmw = new Car("X6", "url",300, 300);

    List<Car> carsList = Arrays.asList(lada,mercedes,bmw);
    System.out.println(carsList);
    Collections.sort(carsList);

    }
}
