package ferreira.marcos.Musicians.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/")
    public String Welcome(){
        return "Bem Vindo(a) a Lista de Músicos";
    }
}
