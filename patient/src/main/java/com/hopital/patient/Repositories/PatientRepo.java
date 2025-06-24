package com.hopital.patient.Repositories;

import com.hopital.patient.Entites.Patient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends MongoRepository<Patient, String> {
}
