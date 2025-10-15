package Facade;

import Subsystem.Cart;
import Subsystem.Valet;
import Subsystem.HouseKeeping;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk( Valet valet, HouseKeeping houseKeeping, Cart cart){
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void callValet(String plateNumber){
        valet.pickUpVehicle(plateNumber);
        valet.execute();
    }

    public void callHouseKeeping(String roomNumber){
        houseKeeping.cleanRoom(roomNumber);
        houseKeeping.execute();
    }

    public void callCart(int numberOfCarts){
        cart.requestCart(numberOfCarts);
        cart.execute();
    }
}
