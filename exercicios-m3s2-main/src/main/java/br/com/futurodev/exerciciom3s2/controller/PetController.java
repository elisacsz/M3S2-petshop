package br.com.futurodev.exerciciom3s2.controller;

import br.com.futurodev.exerciciom3s2.model.Pet;
import br.com.futurodev.exerciciom3s2.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> get() {
        return petService.buscarPets();
    }

    @PostMapping
    public Pet post(@RequestBody Pet pet) {
        return petService.salvar(pet);
    }

    @PutMapping
    public Pet put(@RequestBody Pet pet) {
        return petService.salvar(pet);
    }

    @DeleteMapping
    public boolean delete(@RequestBody Pet pet) {
        petService.excluir(pet.getId());
        return true;
    }

}
