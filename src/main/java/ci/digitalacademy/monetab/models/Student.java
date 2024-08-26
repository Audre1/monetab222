package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@DiscriminatorValue(value ="student")
public class Student extends Personne {

    @Column(name = "matricule",  nullable = false)
    private String matricule;

    @Column(name = "classe",  nullable = false)
    private String classe;



}
