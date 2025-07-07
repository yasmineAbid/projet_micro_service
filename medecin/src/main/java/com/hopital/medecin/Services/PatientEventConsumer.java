package com.hopital.medecin.Services;

import com.hopital.medecin.dto.PatientDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PatientEventConsumer {

    @KafkaListener(topics = "patient.created", groupId = "medecin-group", containerFactory = "patientKafkaListenerFactory")
    public void consumePatientCreated(PatientDTO patientDTO)  {
        System.out.println("📥 Patient reçu via Kafka dans MedecinService :");
        System.out.println("🆔 ID: " + patientDTO.getId());
        System.out.println("👤 Nom: " + patientDTO.getNom());
        System.out.println("👤 Prénom: " + patientDTO.getPrenom());
        System.out.println("🏠 Adresse: " + patientDTO.getAdresse());
        System.out.println("📞 Téléphone: " + patientDTO.getTelephone());
    }
}
