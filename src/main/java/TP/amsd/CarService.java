package TP.amsd;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    // Constructeur : initialisation des données
    public CarService() {
        this.cars = new ArrayList<>();
        cars.add(new Car("AA11BB", "Ferrari", 100, false));
        cars.add(new Car("CC22DD", "BMW", 80, false));
        cars.add(new Car("EE33FF", "Toyota", 50, false));
    }

    // Retourne les voitures non louées
    public List<Car> getUnrentedCars() {
        List<Car> unrentedCars = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isRented()) {
                unrentedCars.add(car);
            }
        }
        return unrentedCars;
    }

    // Détails d'une voiture spécifique
    public Car getCarDetails(String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        throw new RuntimeException("Car not found with plate number: " + plateNumber);
    }

    // Louer une voiture
    public void rentCar(String plateNumber, Dates dates) {
        Car car = getCarDetails(plateNumber);
        if (car.isRented()) {
            throw new RuntimeException("Car is already rented.");
        }
        car.setRented(true);
        System.out.println("Car rented from " + dates.getBegin() + " to " + dates.getEnd());
    }

    // Retourner une voiture
    public void returnCar(String plateNumber) {
        Car car = getCarDetails(plateNumber);
        if (!car.isRented()) {
            throw new RuntimeException("Car is not currently rented.");
        }
        car.setRented(false);
        System.out.println("Car returned.");
    }
}
