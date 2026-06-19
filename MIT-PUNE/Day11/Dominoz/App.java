package Day11.Dominoz;

public class App {
    public static void main(String[] args) {

        System.out.println(RestrauntService.Restrauntype);

        RestrauntService order = (RestrauntService) new Dominoz("Farmhouse Pizza");

        order.acceptOrder("Pankaj");

        order.PrepareFood();

        order.DeliverFood();
    }
}