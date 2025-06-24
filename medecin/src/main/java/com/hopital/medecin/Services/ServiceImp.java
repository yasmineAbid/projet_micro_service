package com.hopital.medecin.Services;
import com.hopital.medecin.Entities.Medecin;
import com.hopital.medecin.Repositories.MedecinRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@AllArgsConstructor
public class ServiceImp implements IService {
   @Autowired
    MedecinRepo medecinRepo;

    @Override
    public List<Medecin> getMedecins() {
        return medecinRepo.findAll();
    }


    @Override
    public Medecin ajouterMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }




}

