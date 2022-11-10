package module6.t01.t05;

import module6.t01.t04.Goods;

import java.util.Date;

public class FoodBasket {
    Goods goods;
    int id;
    int clientId;
    int clientSessionId;
    String dateTime;
    String title;
    int amount;
    int totalPrice;


    public FoodBasket(Goods goods, int id, int clientId, int clientSessionId, String dateTime, String title, int amount, int totalPrice) {
        this.goods = goods;
        this.id = id;
        this.clientId = clientId;
        this.clientSessionId = clientSessionId;
        this.dateTime = dateTime;
        this.title = title;
        this.amount = amount;
        this.totalPrice = totalPrice;
    }
}
