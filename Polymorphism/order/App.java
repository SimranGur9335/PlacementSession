package Polymorphism.order;

public class App {
    public static void main(String[] args) {
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.order();
        foodOrder.order("Pizza");
        foodOrder.order("Burger", 2);
    }
}
