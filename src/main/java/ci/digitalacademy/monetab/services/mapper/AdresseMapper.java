package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.services.DTO.AdresseDTO;


public final class AdresseMapper {
    private AdresseMapper() {
    }

    public static AdresseDTO toDTO(Adresse adresse) {

        AdresseDTO addressDTO = new AdresseDTO();
        addressDTO.setId(adresse.getId());
        addressDTO.setCity(adresse.getCity());
        addressDTO.setContry(adresse.getContry());
        addressDTO.setStreet(adresse.getStreet());
        return addressDTO;
    }

    public static Adresse toEntity(AdresseDTO adresseDTO ){

        Adresse addresse = new Adresse();
        addresse.setId(adresseDTO.getId());
        addresse.setStreet(adresseDTO.getStreet());
        addresse.setCity(adresseDTO.getCity());
        addresse.setContry(adresseDTO.getContry());
        return addresse;
    }

}


