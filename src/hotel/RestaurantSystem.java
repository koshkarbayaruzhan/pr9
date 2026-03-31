package hotel;

public class RestaurantSystem {
    public void bookTable(int people) {
        System.out.println("Стол на " + people + " человек забронирован.");
    }

    public void orderFood(String food) {
        System.out.println("Заказано: " + food);
    }

    public void cancelOrder() {
        System.out.println("Заказ отменен.");
    }
}
