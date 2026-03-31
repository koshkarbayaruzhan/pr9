package hotel;

public class HotelFacade {
    private RoomBookingSystem roomBooking;
    private RestaurantSystem restaurant;
    private EventManagementSystem eventManagement;
    private CleaningService cleaning;

    public HotelFacade() {
        roomBooking = new RoomBookingSystem();
        restaurant = new RestaurantSystem();
        eventManagement = new EventManagementSystem();
        cleaning = new CleaningService();
    }

    // Бронирование номера с рестораном и уборкой
    public void bookRoomWithServices(String roomType, String food) {
        if(roomBooking.isAvailable(roomType)) {
            roomBooking.bookRoom(roomType);
            restaurant.orderFood(food);
            cleaning.scheduleCleaning(roomType);
        }
    }

    // Организация мероприятия
    public void organizeEvent(String eventName, String equipment, String roomType) {
        eventManagement.bookEvent(eventName);
        eventManagement.bookEquipment(equipment);
        roomBooking.bookRoom(roomType);
    }

    // Бронирование стола с такси
    public void bookTableWithTaxi(int people) {
        restaurant.bookTable(people);
        System.out.println("Такси вызвано для " + people + " человек.");
    }

    // Дополнительно: отмена
    public void cancelRoomBooking(String roomType) {
        roomBooking.cancelBooking(roomType);
    }

    public void cancelEvent(String eventName) {
        eventManagement.cancelEvent(eventName);
    }

    public void cancelFoodOrder() {
        restaurant.cancelOrder();
    }
}
