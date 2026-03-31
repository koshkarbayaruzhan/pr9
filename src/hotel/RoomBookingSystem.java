package hotel;

public class RoomBookingSystem {
    public void bookRoom(String roomType) {
        System.out.println("Номер " + roomType + " забронирован.");
    }

    public void cancelBooking(String roomType) {
        System.out.println("Бронирование номера " + roomType + " отменено.");
    }

    public boolean isAvailable(String roomType) {
        return true; 
    }
}
