package pl.javastart.schronisko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.javastart.schronisko.model.Pet;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShelterController {

    @GetMapping("/")
    public String mainPage(Model model){

        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet ("Azor", "Pies znaleziony na ulicy"));
        petList.add(new Pet ("Mruczek", "Kot porzucony przez właściciela"));

        model.addAttribute("petList", petList);

        return "index";
    }

/*    @GetMapping("/")
    public String petPage(){
        return "pet";
    }*/




}
