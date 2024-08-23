package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ficheNote")
public class FicheNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note", nullable = false)
    private String note;

    @Column(name = "teach", nullable = false)
    private String teach ;





}
