package ci.digitalacademy.monetab.services.impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.repository.AdresseRepository;
import ci.digitalacademy.monetab.services.AdresseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdresseServiceImpl implements AdresseService {

    private  final AdresseRepository adresseRepository;

    @Override
    public Adresse save(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    @Override
    public Adresse update(Adresse adresse) {
        Optional<Adresse> optionalAdresse = findOne(adresse.getId());
        if(optionalAdresse.isPresent()){
            Adresse adresseToUpdate = optionalAdresse.get();
            adresseToUpdate.setContry(adresse.getContry());
            adresseToUpdate.setCity(adresse.getCity());
            adresseToUpdate.setStreet(adresse.getStreet());
            return  save(adresseToUpdate);
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Optional<Adresse> findOne(Long id) {
        return adresseRepository.findById(id);
    }

    @Override
    public List<Adresse> findAll() {
        return adresseRepository.findAll();
    }

    @Override
    public void delecte(Long id) {
        adresseRepository.deleteAll();

    }
}
