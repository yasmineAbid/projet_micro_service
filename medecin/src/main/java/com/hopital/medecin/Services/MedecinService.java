package com.hopital.medecin.Services;

import com.hopital.medecin.dto.PatientDTO;
import com.hopital.medecin.feign.PatientFeignClient;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MedecinService {
    private final PatientFeignClient patientFeignClient;

    public MedecinService(PatientFeignClient patientFeignClient) {

        this.patientFeignClient = patientFeignClient;
    }

    public List<PatientDTO> getAllPatients()
    {
        return patientFeignClient.getPatients();
    }
}
