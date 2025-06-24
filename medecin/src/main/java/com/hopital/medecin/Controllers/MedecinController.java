package com.hopital.medecin.Controllers;

import com.hopital.medecin.dto.MedecinDTO;
import com.hopital.medecin.Entities.Medecin;
import com.hopital.medecin.mapper.MedecinMapper;
import com.hopital.medecin.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/medecins")
public class MedecinController {
    @Autowired
    IService service;

    @PostMapping
    public MedecinDTO ajouterMedecin(@RequestBody MedecinDTO medecinDTO) {
        Medecin medecin = MedecinMapper.toEntity(medecinDTO);
        Medecin saved = service.ajouterMedecin(medecin);
        return MedecinMapper.toDTO(saved);
    }

    @GetMapping
    public List<MedecinDTO> getMedecinsDto() {
        return service.getMedecins()
                .stream()
                .map(MedecinMapper::toDTO)
                .collect(Collectors.toList());
    }
}
