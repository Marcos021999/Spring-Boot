package ferreira.marcos.Musicians.control;

import ferreira.marcos.Musicians.model.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ObjectControl {

    @GetMapping("/bandas")
    public ArrayList<List> getNames(){
        List l = new List();
        l.setName("Eric Clapton");
        List l1 = new List();
        l1.setName("Queen");
        List l2 = new List();
        l2.setName("Metallica");

        ArrayList<List> list1 = new ArrayList<>();
        list1.add(l);
        list1.add(l1);
        list1.add(l2);
        return list1;



    }
    @GetMapping("/musicas")
    public ArrayList <List> getMusic(){
        List l = new List();
        l.setMusic("Eric Clapton: Tears in Heaven");
        List l2 = new List();
        l2.setMusic("Queen: Another One Bites Of Dust");
        List l3 = new List();
        l3.setMusic("Metallica: Nothing Else Matter ");

        ArrayList<List> list2 = new ArrayList<>();
        list2.add(l);
        list2.add(l2);
        list2.add(l3);
        return list2;
    }

    @GetMapping("/cidades")
    public ArrayList <List> getCity(){
        List l = new List();
        l.setCity("Eric Clapton: Nova York");
        List l2 = new List();
        l2.setCity("Queen: Porto Alegre");
        List l3 = new List();
        l3.setCity("Metallica: Canoas");

        ArrayList<List> list3 = new ArrayList<>();
        list3.add(l);
        list3.add(l2);
        list3.add(l3);
        return list3;
    }


}
