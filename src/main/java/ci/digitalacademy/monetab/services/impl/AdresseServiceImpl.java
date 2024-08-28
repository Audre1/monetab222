package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.repository.AdresseRepository;
import ci.digitalacademy.monetab.services.AdresseService;
import ci.digitalacademy.monetab.services.DTO.AdresseDTO;
import ci.digitalacademy.monetab.services.mapper.AdresseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdresseServiceImpl implements AdresseService {

    private  final AdresseRepository adresseRepository;

    @Override
    public AdresseDTO save(AdresseDTO adresseDTO) {
         Adresse adresse = AdresseMapper.toEntity(adresseDTO);
       adresse = adresseRepository.save(adresse);
       return AdresseMapper.toDTO(adresse);
    }

    @Override
    public AdresseDTO update(AdresseDTO adresseDTO) {
        return findOne(adresseDTO.getId()).map(existingAdress->{
            existingAdress.setContry(adresseDTO.getContry());
            existingAdress.setCity(adresseDTO.getCity());
            existingAdress.setStreet(adresseDTO.getStreet());
            return save(existingAdress);

        }).orElseThrow(()->new IllegalArgumentException());
    }

    @Override
    public Optional<AdresseDTO> findOne(Long id) {
        return adresseRepository.findById(id).map(adresse -> {
          return   AdresseMapper.toDTO(adresse);
        });
    }

    @Override
    public List<AdresseDTO> findAll() {
        return adresseRepository.findAll().stream().map(adresse -> {
          return AdresseMapper.toDTO(adresse);


        }).toList();
    }

    @Override
    public void delecte(Long id) {
        adresseRepository.deleteAll();

    }
}
