package ferreira.marcos.Studentrecord.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/")
    public String Welcome(){
        return "Bem Vindo(a) ao Registro de Alunos";
    }

}
