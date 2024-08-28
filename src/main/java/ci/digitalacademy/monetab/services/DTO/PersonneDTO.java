package ci.digitalacademy.monetab.services.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonneDTO {

    private Long id;

    private String nom;

    private String prenom;

    private String email;

    private String ville;

    private String telephone;

    private String age;
}
