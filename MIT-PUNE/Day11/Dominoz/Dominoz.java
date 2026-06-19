package Day11.Dominoz;

public class Dominoz implements RestrauntService {

    String FoodItem;

    Dominoz(String FoodItem) {
        this.FoodItem = FoodItem;
    }

    @Override
    public void acceptOrder(String CustomerName) {
        System.out.println("Hello " + CustomerName + " your order is accepted!!");
    }

    @Override
    public void PrepareFood() {
        System.out.println("Preparing your pizza...");
    }

    @Override
    public void DeliverFood() {
        System.out.println("Food will be delivered in 30 mins");
    }
}