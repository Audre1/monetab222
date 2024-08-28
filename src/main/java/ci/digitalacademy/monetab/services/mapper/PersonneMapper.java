package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Personne;
import ci.digitalacademy.monetab.services.DTO.PersonneDTO;
import ci.digitalacademy.monetab.services.DTO.StudentDTO;

public  final class PersonneMapper {

    private PersonneMapper(){
    }

    public static PersonneDTO toDTO(Personne personne){

        PersonneDTO personneDTO = new PersonneDTO();

        personneDTO.setId(personne.getId());
        personneDTO.setNom(personne.getNom());
        personneDTO.setPrenom(personne.getPrenom());
        personneDTO.setEmail(personne.getEmail());
        personneDTO.setVille(personne.getVille());
        personneDTO.setAge(personne.getAge());
        personneDTO.setTelephone(personne.getTelephone());
        return personneDTO;
    }

    public static Personne toEntity(PersonneDTO personneDTO){

        Personne personne = new Personne();

        personne.setId(personneDTO.getId());
        personne.setNom(personneDTO.getNom());
        personne.setPrenom(personneDTO.getPrenom());
        personne.setEmail(personneDTO.getEmail());
        personne.setVille(personneDTO.getVille());
        personne.setAge(personneDTO.getAge());
        personne.setTelephone(personneDTO.getTelephone());

        return personne;
    }

}
