package com.hopital.patient.Services;
import com.hopital.patient.dto.MedecinDTO;
import com.hopital.patient.feign.MedecinFeignClient;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class PatientService {
    private final MedecinFeignClient medecinFeignClient;

    public PatientService(MedecinFeignClient medecinFeignClient) {
        this.medecinFeignClient = medecinFeignClient;
    }


    public List<MedecinDTO> getAllMedecins() {
        return medecinFeignClient.getAllMedecins();

    }
}