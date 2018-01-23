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

    private PetStorage petStorage;

        @Autowired
    public ShelterController (PetStorage petStorage){
        this.petStorage = petStorage;
    }

    @GetMapping("/")
    public String mainPage(Model model){

        ArrayList<Pet> petList = (ArrayList<Pet>)petStorage.getPetList();
        model.addAttribute("petList", petList);

        return "index";
    }

    @GetMapping("/{kind}")
    public String petPage(@PathVariable String kind, Model model){
        ArrayList<Pet> petList = (ArrayList<Pet>)petStorage.getPetList();
        List<Pet> kindList = new ArrayList<>();
        for (Pet petKind : petList) {
            if (kind.equals(petKind.getKind())){
                kindList.add(new Pet(petKind.getName(),petKind.getDescription(),petKind.getKind()));
            }
        }
        model.addAttribute("kindList",kindList);

        return "pet";
    }

    @GetMapping("/desc/{name}")
    public String descriptionPage(@PathVariable String name, Model model){
        ArrayList<Pet> petList = (ArrayList<Pet>)petStorage.getPetList();
        Pet pet = null;
        for (Pet petNameList : petList) {
            if (name.equals(petNameList.getName())){
                pet = petNameList;
            }
        }
        model.addAttribute("pet", pet);

        return "description";
    }


}
