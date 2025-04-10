package design_patterns.architectural.mvcExample2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRentalApp {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("7800hg", "Honda", "Civic", 100));
        cars.add(new Car("0987ui", "BMW", "M3", 200));
        cars.add(new Car("1234tg", "Toyota", "Corolla", 30));

        CarRentalController controller = new CarRentalController(cars, new CarRentalView());
        controller.showAvailableCars();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the license plate of the car you wish to rent:");
            String license = scan.next();
            controller.rentCar(license);
        }
    }
}
