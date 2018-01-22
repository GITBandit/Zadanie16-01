package pl.javastart.schronisko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.javastart.schronisko.model.Pet;
import pl.javastart.schronisko.model.PetStorage;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShelterController {

    private PetStorage stor = new PetStorage();
    private List<Pet> petList = stor.getPetList();


    @GetMapping("/")
    public String mainPage(Model model){


        model.addAttribute("petList", petList);

        return "index";
    }

    @GetMapping("/{kind}")
    public String petPage(@PathVariable String kind, Model model){
        List<Pet> kindList = new ArrayList<>();
        for (Pet petKind : petList) {
            if (kind.equals(petKind.getKind())){
                kindList.add(new Pet(petKind.getName(),petKind.getDescription(),petKind.getKind()));
            }
        }
        model.addAttribute("kindList",kindList);

        return "pet";
    }




}
