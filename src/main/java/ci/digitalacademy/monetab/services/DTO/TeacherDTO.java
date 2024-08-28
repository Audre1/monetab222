package ci.digitalacademy.monetab.services.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO extends PersonneDTO{
    private String matiere;

    private boolean vacant;
}
