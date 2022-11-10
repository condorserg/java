package module6.t01.t04;

import java.util.Date;

public class Goods {
    String id;
    String Title;
    int weight;
    int price;
    int amount;
    Date manufactureDate;
    Date bestBefore;

    public Goods(String id, String title, int weight, int price, int amount, Date manufactureDate, Date bestBefore) {
        this.id = id;
        Title = title;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.manufactureDate = manufactureDate;
        this.bestBefore = bestBefore;
    }
}
