package Subsystem;

public class HouseKeeping implements HotelService {
    private String roomNumber;
    public HouseKeeping(String roomNumeber){
        this.roomNumber = roomNumber;
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("\nHousekeeping Service: Cleaning room: " + roomNumber);
    }

    @Override
    public void execute() {
        System.out.println("Housekeeping Service: Currently cleaning room: " + roomNumber);
    }
}