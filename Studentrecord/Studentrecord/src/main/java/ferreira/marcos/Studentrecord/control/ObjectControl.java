package ferreira.marcos.Studentrecord.control;

import ferreira.marcos.Studentrecord.model.Variables;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ObjectControl {

    @GetMapping("/alunos")
    public ArrayList <Variables> getNames(){
        Variables v = new Variables();
        v.setName("Ricardo, 115 anos");
        Variables v1 = new Variables();
        v1.setName("Jorge, 16 anos");
        Variables v2 = new Variables();
        v2.setName("Marcos, 17 anos");

        ArrayList<Variables> variables = new ArrayList<>();
        variables.add(v);
        variables.add(v1);
        variables.add(v2);
        return variables;



    }


    @GetMapping("/jorge")
    public String Jorge(){
        Variables v = new Variables();
        v.setYear("jorge: 1º ano");
        return v.getYear();
    }
    @GetMapping("/Marcos")
    public String Marcos(){
        Variables v = new Variables();
        v.setYear("Marcos: 3º ano");
        return v.getYear();
    }
    @GetMapping("/Ricardo")
    public String Ricardo(){
        Variables v = new Variables();
        v.setYear("Ricardo: 2º ano");
        v.setYear("Marcos: 3º ano");
        return v.getYear();
    }


}
