package module6.t01.t04;

import java.util.Date;

public class Goods {
    int id;
    String Title;
    int weight;
    int price;
    int amount;
    String manufactureDate;
    String bestBefore;

    public Goods(int id, String title, int weight, int price, int amount, String manufactureDate, String bestBefore) {
        this.id = id;
        Title = title;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.manufactureDate = manufactureDate;
        this.bestBefore = bestBefore;
    }
}
