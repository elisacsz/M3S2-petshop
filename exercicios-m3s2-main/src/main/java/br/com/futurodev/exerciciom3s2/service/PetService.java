package br.com.futurodev.exerciciom3s2.service;

import br.com.futurodev.exerciciom3s2.model.Pet;
import br.com.futurodev.exerciciom3s2.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet salvar(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> buscarPets() {
        return petRepository.findAll();
    }

    public void excluir(Integer id) {
        petRepository.delete(id);
    }

}
