package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Etablissement")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Etablissement extends eu.ensup.etablissementScolaireSpring.domaine.Personne {

    /**
     * The Directeur.
     */
    eu.ensup.etablissementScolaireSpring.domaine.Directeur directeur;

    /**
     * Instantiates a new Etablissement.
     */
    public Etablissement() {
    }

}
