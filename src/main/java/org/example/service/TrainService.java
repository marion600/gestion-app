package org.example.service;

import org.example.bdd.models.TrainDAO;
import org.example.bdd.repositories.TrainRepository;
import org.example.model.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrainService {

    private final TrainRepository repository;

    @Autowired
    public TrainService(TrainRepository repository) {
        this.repository = repository;
    }

    // 🔹 Travail 24 : rechercher en BD via findByMatricule
    public Train rechercher(String matricule) {
        TrainDAO dao = repository.findByMatricule(matricule);
        if (dao == null) {
            return null; // ou throw (selon ce que veut ton prof)
        }

        Train train = new Train();
        train.setMatricule(dao.getMatricule());
        train.setWagons(new ArrayList<>()); // on garde wagons vide pour l’instant
        return train;
    }

    // (Optionnel) si ton code appelle encore creer ailleurs, tu peux le garder temporairement
    public Train creer(String matricule) {
        Train train = new Train();
        train.setMatricule(matricule);
        train.setWagons(new ArrayList<>());
        return train;
    }
}
