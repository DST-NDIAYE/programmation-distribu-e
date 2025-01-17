package TP.amsd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaClasse {
    @GetMapping("/")
public String hello() {
return "Bonjour tout le monde je suis Serigne Ndiaye";
}
}
