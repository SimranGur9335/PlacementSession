package Polymorphism.order;

public class FoodOrder {
    void order() {
        System.out.println("Ordering food...");
    }
    void order(String food) {
        System.out.println("Ordering " + food + "...");
    }

    void order(String food, int quantity) {
        if (food == null || food.isEmpty()) {
            System.out.println("Food name cannot be empty.");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Quantity must be a positive number.");
            return;
        }
        int totalPrice = quantity * 10; 
        System.out.println("Ordering " + quantity + " " + food + " for a total price of " + totalPrice + "...");
    }

    void order(String food,int quantity, double discount) {
        if (food == null || food.isEmpty()) {
            System.out.println("Food name cannot be empty.");
            return;
        }
        if (quantity <= 0) {
            System.out.println("Quantity must be a positive number.");
            return;
        }
        if (discount < 0 || discount > 100) {
            System.out.println("Discount must be a number between 0 and 100.");
            return;
        }
        int totalPrice = quantity * 10;
        double discountedPrice = totalPrice - (totalPrice * discount / 100);
        System.out.println("Ordering " + quantity + " " + food + " for a total price of " + discountedPrice + " with a discount of " + discount + "%...");
    }
    void order(String food[],int quantity[]) {
        if (food == null || quantity == null) {
            System.out.println("Food list and quantity list cannot be null.");
            return;
        }
        if (food.length != quantity.length) {
            System.out.println("The number of foods and quantities must match.");
            return;
        }
        int grandTotal = 0;
        int price=200;
        for (int i = 0; i < food.length; i++) {
            if (food[i] == null || food[i].isEmpty()) {
                System.out.println("Food name cannot be empty.");
                return;
            }
            if (quantity[i] <= 0) {
                System.out.println("Quantity must be a positive number.");
                return;
            }
            int totalPrice = quantity[i] * price;
            grandTotal += totalPrice;
            System.out.println("Ordering " + quantity[i] + " " + food[i] + " for a total price of " + totalPrice + "...");
        }
        System.out.println("Grand Total: " + grandTotal + "...");
    }
}
