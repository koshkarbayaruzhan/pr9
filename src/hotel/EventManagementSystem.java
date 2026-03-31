package hotel;

public class EventManagementSystem {
    public void bookEvent(String eventName) {
        System.out.println("Мероприятие '" + eventName + "' забронировано.");
    }

    public void bookEquipment(String equipment) {
        System.out.println("Оборудование '" + equipment + "' забронировано.");
    }

    public void cancelEvent(String eventName) {
        System.out.println("Мероприятие '" + eventName + "' отменено.");
    }
}
