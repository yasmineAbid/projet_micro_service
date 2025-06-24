package com.hopital.patient.Services;
import com.hopital.patient.Entites.Patient;
import java.util.List;
public interface IService {
    Patient ajouterPatient (Patient patient);
    List<Patient> getPatients();
}

