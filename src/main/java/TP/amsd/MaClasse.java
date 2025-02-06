package TP.amsd;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaClasse {

    Logger logger = LoggerFactory.getLogger(MaClasse.class);

    @GetMapping("/")
    public String hello() {
        return "Bonjour tout le monde je suis Serigne Ndiaye";
    }

    @RestController
    @RequestMapping("/cars")
    public class CarController {
        private final CarService carService = new CarService();

        // Endpoint pour obtenir les voitures non louées
        @GetMapping
        public List<Car> listUnrentedCars() {
            return carService.getUnrentedCars();
        }

        // Endpoint pour obtenir les détails d'une voiture
        @GetMapping("/{plateNumber}")
        public Car getCarDetails(@PathVariable String plateNumber) {
            return carService.getCarDetails(plateNumber);
        }

        // Endpoint pour louer ou rendre une voiture
        @PutMapping("/{plateNumber}")
        public void rentOrReturnCar(
                @PathVariable String plateNumber,
                @RequestParam boolean rent,
                @RequestBody(required = false) Dates dates) {
            if (rent) {
                carService.rentCar(plateNumber, dates);
            } else {
                carService.returnCar(plateNumber);
            }
        }
    }

}
