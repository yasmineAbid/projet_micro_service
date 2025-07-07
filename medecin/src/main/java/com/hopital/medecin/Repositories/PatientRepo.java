package com.hopital.medecin.Repositories;
import com.hopital.medecin.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepo extends JpaRepository <Patient, Long> {

}

