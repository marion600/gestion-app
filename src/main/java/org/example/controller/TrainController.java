package org.example.controller;

import org.example.model.Train; // <-- import corrigé
import org.example.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {

    @Autowired
    private TrainService service;

    @GetMapping("/train/consulter")
    public Train consulterTrain(@RequestParam(value = "matricule", required = true) String matricule) {
        return service.rechercher(matricule);

    }
}
