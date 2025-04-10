package design_patterns.architectural.mvcExample2;

import java.util.List;

//View
public class CarRentalView {

    public void displayAvailabeCars(List<Car> cars){
        for(Car car: cars){
            System.out.println(car);//implicit call to car.toString()
        }

    }

    public void displayRentedCar(Car car){
        System.out.println("The Following car has been rented:");
        System.out.println(car);
    }

    public void displayError(String message){
        System.out.println("Error" + message);
    }
}
