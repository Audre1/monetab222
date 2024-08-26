package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "personne_type")
@Table(name = "personne")
public class Personne{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "nom",  nullable = false)
    private String nom;


    @Column(name = "prenom",  nullable = false)
    private String prenom;

    @Column(name = "email",  nullable = false, unique = true)
    private String email;

    @Column(name = "ville",  nullable = false)
    private String ville;

    @Column(name = "genre",  nullable = false)
    private String genre;

    @Column(name = "telephone",  nullable = false)
    private String telephone;

    @Column(name = "age",  nullable = false)
    private String age;
}
