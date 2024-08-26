package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
//@DiscriminatorValue(value = "teacher")
public class Teacher extends Personne {

    @Column(name = "matiere", nullable = false)
    private String matiere;

    @Column(name = "prochainCours", nullable = false)
    private String prochainCours;

    @Column(name = "sujetProchainReunion", nullable = false)
    private String sujetProchainReunion;

    @Column(name = "vacant", nullable = false)
    private boolean vacant;

//    @OneToMany(fetch= FetchType.EAGER, mappedBy="teacher")
//    private Collection<FicheNote> ficheNote;


}
