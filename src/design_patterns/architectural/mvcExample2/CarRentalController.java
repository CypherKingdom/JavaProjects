package design_patterns.architectural.mvcExample2;

import java.util.ArrayList;
import java.util.List;

//controller
public class CarRentalController {
    private List<Car> cars;
    private CarRentalView view;

    public CarRentalController(List<Car> cars, CarRentalView view) {
        this.cars = cars;
        this.view = view;
    }

    public void showAvailableCars(){
        List<Car> availableCars = new ArrayList<Car>();
        for(Car car: cars){
            if(car.isAvailable())
                availableCars.add(car);

        }
        
        view.displayAvailabeCars(cars);
    }
    public void rentCar(String licensePlate){
        for(Car car: cars){
            if(car.getLicensePlate().equals(licensePlate)){
                if(!car.isAvailable()){
                    view.displayError(licensePlate + "is not available");
                    return;
                }
                car.setAvailable(false);
                view.displayRentedCar(car);
                return;
            }
        }
        view.displayError(licensePlate + " does not exist");
        //throw new IllegalArgumentException("Car does not exist/is not available");

    }
    

}
