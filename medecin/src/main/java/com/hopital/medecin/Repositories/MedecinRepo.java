package com.hopital.medecin.Repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hopital.medecin.Entities.Medecin;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


@Repository
public interface MedecinRepo extends JpaRepository<Medecin,Long> {
}
