package Subsystem;

public class Cart implements HotelService {
    private int numberOfCarts;
    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart(int numberOfCarts){
        System.out.println("\nCart Service: Number of carts requested: " + numberOfCarts);
    }

    @Override
    public void execute() {
        System.out.print("Cart Service: Number of carts succesfully requested: " + numberOfCarts);
    }
}
