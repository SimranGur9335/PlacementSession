package Polymorphism.Parking;

public class ParkingSystem {
    void calculateToll() {
        String Vehicle[] = { "Car", "Bike", "Truck", "Car", "Bike" };

        int carCount = 0, bikeCount = 0, truckCount = 0;
        int carToll = 0, bikeToll = 0, truckToll = 0;

        for (String v : Vehicle) {

            if (v.equals("Car")) {
                Car c = new Car();
                carCount++;
                carToll += c.toll();
            } else if (v.equals("Bike")) {
                Bike b = new Bike();
                bikeCount++;
                bikeToll = b.toll();
            } else if (v.equals("Truck")) {
                Truck t = new Truck();
                truckCount++;
                truckToll += t.toll();
            }
        }

        System.out.println("Cars = " + carCount);
        System.out.println("Bikes = " + bikeCount);
        System.out.println("Trucks = " + truckCount);

        System.out.println("Car Toll = " + carToll);
        System.out.println("Bike Toll = " + bikeToll);
        System.out.println("Truck Toll = " + truckToll);

        System.out.println("Total Toll = " + (carToll + bikeToll + truckToll));
    }
}
