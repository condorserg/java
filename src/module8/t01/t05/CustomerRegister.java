package module8.t01.t05;

public interface CustomerRegister {

    public default void registerCustomer() {
        System.out.println("Регистрация покупателя");
    }
    public default void updateCustomerInfo() {
        System.out.println("Обновление данных покупателя");
    }
}
