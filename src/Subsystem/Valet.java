package Subsystem;

public class Valet implements HotelService {
    private String plateNumber;
    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("\nValet Service: Picking up vehicle with plate number: " + plateNumber);
    }

    @Override
    public void execute() {
        System.out.println("Valet Service: Parking vehicle with plate number: " + plateNumber);
    }
}