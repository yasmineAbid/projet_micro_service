package com.hopital.medecin.Controllers;
import com.hopital.medecin.dto.MessageDTO;
import com.hopital.medecin.feign.PatientFeignClient;
import com.hopital.medecin.dto.MedecinDTO;
import com.hopital.medecin.dto.PatientDTO;
import com.hopital.medecin.Entities.Medecin;
import com.hopital.medecin.mapper.MedecinMapper;
import com.hopital.medecin.Services.IService;
import com.hopital.medecin.Services.MedecinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.hopital.medecin.feign.PatientFeignClient;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/medecins")
public class MedecinController {

    private final IService service;
    private final MedecinService medecinService;

    @PostMapping
    public MedecinDTO ajouterMedecin(@RequestBody MedecinDTO medecinDTO) {
        Medecin medecin = MedecinMapper.toEntity(medecinDTO);
        Medecin saved = service.ajouterMedecin(medecin);
        return MedecinMapper.toDTO(saved);
    }

    @GetMapping
    public List<MedecinDTO> getMedecins() {
        return service.getMedecins()
                .stream()
                .map(MedecinMapper::toDTO)
                .collect(Collectors.toList());
    }
    @GetMapping("/patients")
    public ResponseEntity<?> getAllPatients() {
        List<PatientDTO> patients = medecinService.getAllPatients();

        if (!patients.isEmpty() && patients.get(0).getMessage() != null) {
            // Fallback détecté
            MessageDTO messageDTO = new MessageDTO(patients.get(0).getMessage());
            return ResponseEntity.ok(messageDTO);
        }

        return ResponseEntity.ok(patients);
    }




}
