package design_patterns.architectural.layers;

import java.util.*;

//Service/Business layer
public class CarRentalService {
    private CarRepository repository;

    public CarRentalService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAvailableCars(){
        List<Car> allCars = repository.getAllCars();
        allCars.removeIf(x ->!x.isAvailable());//x is an element of the list allCars => x is a car
        return allCars;

        /*List<Car> availableCars = new ArrayList<Car>();//empty list
        for(Car car: allCars){
            if(car.isAvailable()){
                availableCars.add(car);
            }
        }
        return availableCars;*/
    }

    public boolean rentCar(String licensePlate){
        Car car = repository.findCarByLicensePlate(licensePlate);
        if(car == null || !car.isAvailable() ){
            System.out.println("You cannot rent the unavailabel car " + licensePlate);
            return false;
        }
        car.setAvailable(false);
        System.out.println("You have successfully rented the car");
        return true;
    }
}
