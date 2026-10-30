public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M3", 2003);
        Truck truck1 = new Truck("Chevrolet", "Silverado", 2024);

        car1.displayInfo();
        car1.displayType();
        System.out.println();

        truck1.displayInfo();
        truck1.displayType();

    }
}
