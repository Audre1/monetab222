package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="teacher-id")
//    private Teacher teacher;
//
//    @Override
//    public String toString() {
//        return "FicheNote{" +
//                "id=" + id +
//                ", note='" + note + '\'' +
//                ", teach='" + teach + '\'' +
//                ", teacher=" + teacher +
//                '}';
//    }
}


