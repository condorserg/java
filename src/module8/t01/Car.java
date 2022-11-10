package module8.t01;

/**
 * Составить класс для автомобиля с произвольными параметрами и конструкторами
 */

public class Car implements CarMove {
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

    @Override
    public void move(int pointA, int pointB) {

    }
}

