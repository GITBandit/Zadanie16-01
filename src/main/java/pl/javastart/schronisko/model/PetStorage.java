package pl.javastart.schronisko.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class PetStorage {


        private List<Pet> petList = new ArrayList<>();

    public PetStorage() {
        petList.add(new Pet ("Azor", "Pies znaleziony na ulicy", "pies"));
        petList.add(new Pet ("Mruczek", "Kot porzucony przez właściciela", "kot"));
        petList.add(new Pet ("Szarik", "Pies z czterech pancernych na emeryturze", "pies"));
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }

    @Override
    public String toString() {
        return "PetStorage{" +
                "petList=" + petList +
                '}';
    }
}
