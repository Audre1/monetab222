package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.services.DTO.AdresseDTO;

import java.util.List;
import java.util.Optional;

public interface AdresseService {

    AdresseDTO save(AdresseDTO adresseDTO);

    AdresseDTO update(AdresseDTO adresseDTO);

    Optional<AdresseDTO> findOne(Long id);

    List<AdresseDTO> findAll();

    void delecte(Long id);
}
