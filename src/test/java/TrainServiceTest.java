package org.example.service;

import org.example.model.Train; // <-- import corrigé
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrainServiceTest {

    @Test
    void creer_matricule_ok() {
        TrainService service = new TrainService();

        Train train = service.creer("8921");

        assertEquals("8921", train.getMatricule());
        assertNotNull(train.getWagons());
        assertTrue(train.getWagons().isEmpty());
    }
}
