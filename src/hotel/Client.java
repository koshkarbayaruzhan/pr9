package hotel;

public class Client {
    public static void main(String[] args) {
        HotelFacade hotel = new HotelFacade();

        hotel.bookRoomWithServices("Deluxe", "Суши");
        hotel.organizeEvent("Конференция", "Проектор", "Suite");
        hotel.bookTableWithTaxi(4);

        hotel.cancelRoomBooking("Deluxe");
        hotel.cancelEvent("Конференция");
        hotel.cancelFoodOrder();
    }
}
