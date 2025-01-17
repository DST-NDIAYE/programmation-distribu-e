package TP.amsd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaClasse {

    Logger logger = LoggerFactory.getLogger(MaClasse.class);

    @GetMapping("/")
    public String hello() {
        return "Bonjour tout le monde je suis Serigne Ndiaye";
    }

    @PutMapping(value = "/cars/{plateNumber}")
    public void rent(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value = "rent", required = true) boolean rent,
            @RequestBody Dates dates) {

        logger.info("PlateNumber:" + plateNumber);
        logger.info("Rent:" + rent);
        logger.info("Dates:" + dates);
    }

}
