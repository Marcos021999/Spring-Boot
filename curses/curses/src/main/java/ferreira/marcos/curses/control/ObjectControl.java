package ferreira.marcos.curses.control;

import ferreira.marcos.curses.model.Variables;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ObjectControl {

    @GetMapping("/cursos")
    public ArrayList<Variables> getCurses() {
        Variables v = new Variables();
        v.setCurse("JAVA");
        Variables v2 = new Variables();
        v2.setCurse("PHP");
        Variables v3 = new Variables();
        v3.setCurse("python");
        ArrayList<Variables> variables = new ArrayList<>();
        variables.add(v);
        variables.add(v2);
        variables.add(v3);

        return variables;


    }

    @GetMapping("/JAVA")
    public String java() {
        Variables v = new Variables();
        v.setLength("duração do curso de JAVA: 70 horas");
        return v.getLength();
    }

    @GetMapping("/python")
    public String python() {
        Variables v = new Variables();
        v.setLength("duração do curso de python: 9 horas");
        return v.getLength();

    }

    @GetMapping("/PHP")
    public String PHP() {
        Variables v = new Variables();
        v.setLength("duração do curso de PHP: 6 horas");
        return v.getLength();


    }
}

