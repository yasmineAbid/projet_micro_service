package com.hopital.patient.Services;
import com.hopital.patient.dto.PatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PatientEventProducer {
    private static final String TOPIC_PATIENT_CREATED = "patient.created";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendPatientCreatedEvent(PatientDTO patientDTO) {
        kafkaTemplate.send(TOPIC_PATIENT_CREATED, patientDTO);
        System.out.println("✅ Event patient.created envoyé pour l'ID patient : " + patientDTO.getId());
    }
}
