package design_patterns.architectural.layers;

import java.util.*;

//Data Layer
public class CarRepository {
    private List<Car> cars = new ArrayList<Car>();

    public CarRepository(){
        cars.add(new Car("345N", "Mitsubishi", "Montero", 200));
        cars.add(new Car("678T", "Toyota", "Corolla", 70));
        cars.add(new Car("098J", "Seat", "Ibiza", 100));
    }

    public List<Car> getAllCars(){
        return this.cars;
    }

    public void addCar(String licensePlate, String brand, String model, double rentalPrice){
        for (Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)){
                //System.out.println("Cannot add the new car. A car with similar license plate already exist.");
                //return;
                throw new IllegalArgumentException("Cannot add the new car. A car with similar license plate already exist.");
            }
        }
        cars.add(new Car(licensePlate, brand, model, rentalPrice));
    }

    public void removeCar(String licensePlate, String brand, String model, double rentalPrice){
        for (Car car:cars){
            if(car.getLicensePlate().equals(licensePlate)){
                cars.remove(car);
                return;
            }
        }
        System.out.println("Cannot remove the car. It does not exist.");
    }

    public Car findCarByLicensePlate(String licensePlate){
        for(Car car: cars){
            if(car.getLicensePlate().equals(licensePlate)){
                return car;
            }
        }
        return null;
    }
}
