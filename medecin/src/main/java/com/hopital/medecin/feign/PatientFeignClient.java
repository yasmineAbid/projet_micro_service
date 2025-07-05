package com.hopital.medecin.feign;
import com.hopital.medecin.dto.PatientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "patient-service", url = "http://localhost:9090",fallback = PatientFeignClientFallBack.class)
public interface PatientFeignClient {

    @GetMapping("/patients")
    List<PatientDTO> getPatients();

    @GetMapping("/patients/{id}")
    PatientDTO getPatientById(@PathVariable("id") Long id);


}
