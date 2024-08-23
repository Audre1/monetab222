package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="note")

public class Note {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "notel", nullable = false)
        private String notel;

        @Column(name = "matiere", nullable = false)
        private String matiere;


    }
