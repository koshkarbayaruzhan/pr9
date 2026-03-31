package hotel;

public class CleaningService {
    public void scheduleCleaning(String roomType) {
        System.out.println("Уборка для " + roomType + " запланирована.");
    }

    public void performCleaning(String roomType) {
        System.out.println("Номер " + roomType + " убран.");
    }
}
