package com.hopital.patient.Services;
import com.hopital.patient.Entites.Patient;
import com.hopital.patient.Repositories.PatientRepo;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceImp implements IService {
   @Autowired
   PatientRepo patientRepo;
    @Override
    public List<Patient> getPatients() {
        return patientRepo.findAll();
    }
    @Override
    public Patient ajouterPatient (Patient patient) {
        return patientRepo.save(patient);
    }
}
