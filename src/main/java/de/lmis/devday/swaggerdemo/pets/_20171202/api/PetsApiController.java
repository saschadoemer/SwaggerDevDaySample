package de.lmis.devday.swaggerdemo.pets._20171202.api;

import de.lmis.devday.swaggerdemo.pets._20171202.model.NewPet;
import de.lmis.devday.swaggerdemo.pets._20171202.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("API20171202")
@RequestMapping("/api/20171202")
public class PetsApiController implements PetsApi {

    @Override
    public ResponseEntity<Pet> addPet(NewPet pet) {
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long id) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Pet> findPetById(Long id) {
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Pet>> findPets(List<String> tags, Integer limit) {
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

}
