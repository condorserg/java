package module6.t01.t02;

/**
 * Составить класс для автомобиля с произвольными параметрами и конструкторами
 */

public class Car {
    String model;
    String pictLink;
    int enginePower;
    int maxSpeed;

    public Car(String model, String pictLink, int enginePower, int maxSpeed) {
        this.model = model;
        this.pictLink = pictLink;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
    }
}

