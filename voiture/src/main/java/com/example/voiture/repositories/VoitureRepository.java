package com.example.voiture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.voiture.entities.Voiture;
import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    List<Voiture> findByIdClient(Long idClient);
}
