package ci.digitalacademy.monetab.services.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentDTO extends PersonneDTO {

    private String matricule;

    private String classe;
}
