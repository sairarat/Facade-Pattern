package Client;

import Subsystem.HouseKeeping;
import Subsystem.Valet;
import Subsystem.Cart;
import Facade.FrontDesk;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your plate number: ");
        String plateNumber = scanner.nextLine();
        System.out.print("Enter your room number: ");
        String roomNumber = scanner.nextLine();
        System.out.print("Enter your requested number of carts: ");
        int numberOfCarts = scanner.nextInt();

        Valet valet = new Valet(plateNumber);
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        Cart cart = new Cart(numberOfCarts);

        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

        frontDesk.callValet(plateNumber);
        frontDesk.callHouseKeeping(roomNumber);
        frontDesk.callCart(numberOfCarts);

        scanner.close();

    }
}
