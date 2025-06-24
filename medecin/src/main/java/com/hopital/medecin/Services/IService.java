package com.hopital.medecin.Services;

import org.springframework.context.annotation.Import;
import com.hopital.medecin.Entities.Medecin;
import java.util.List;


public interface IService {
    Medecin ajouterMedecin(Medecin medecin);

    List<Medecin> getMedecins();
}
