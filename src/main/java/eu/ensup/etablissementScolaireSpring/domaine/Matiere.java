package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Matiere")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String libelle;

    public Matiere(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    public Matiere(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return libelle;
    }
}
