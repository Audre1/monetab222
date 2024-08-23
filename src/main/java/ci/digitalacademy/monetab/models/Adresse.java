package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="adresse")

public class Adresse {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "contry",  nullable = false)
        private String contry;

    @Column(name = "city",  nullable = false)
    private String city;

    @Column(name = "street",  nullable = false)
    private String street;

    }
