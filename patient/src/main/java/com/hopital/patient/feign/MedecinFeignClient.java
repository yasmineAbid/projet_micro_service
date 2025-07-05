package com.hopital.patient.feign;

import com.hopital.patient.dto.MedecinDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "medecin-service", url = "http://localhost:8089")
public interface MedecinFeignClient {

    @GetMapping("/medecins")
    List<MedecinDTO> getAllMedecins();

    @GetMapping("/medecins/{id}")
    MedecinDTO getMedecinById(@PathVariable("id") Long id);
}
