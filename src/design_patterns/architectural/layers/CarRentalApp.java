package design_patterns.architectural.layers;

import java.util.Scanner;

//Presentation layer
public class CarRentalApp {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            CarRentalService service = new CarRentalService(new CarRepository());
            System.out.println("Welcome to our rental app. Below are our available cars: ");
            System.out.println(service.getAvailableCars());
            boolean rentSuccess = false;
            do {
                System.out.println("Which car would you like to rent? Enter its license plate: ");
                String license = scan.next();
                rentSuccess = service.rentCar(license);
            } while (!rentSuccess);
        }
    }
}
