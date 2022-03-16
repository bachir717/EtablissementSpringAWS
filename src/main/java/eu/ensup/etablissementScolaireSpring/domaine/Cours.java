package eu.ensup.etablissementScolaireSpring.domaine;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cours")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int nbHeures;

    private String theme;
    private List<Etudiant> etudiants = new ArrayList<Etudiant>();

    /**
     * Instantiates a new Cours.
     *
     * @param theme    the theme
     * @param nbHeures the nb heures
     */
    public Cours(String theme, int nbHeures) {

        this.nbHeures = nbHeures;
        this.theme = theme;
    }


    /**
     * Instantiates a new Cours.
     *
     * @param id       the id
     * @param theme    the theme
     * @param nbHeures the nb heures
     */
    public Cours(int id,String theme, int nbHeures) {
        this.id = id;
        this.nbHeures = nbHeures;
        this.theme = theme;
    }

    /**
     * Instantiates a new Cours.
     */
    public Cours() {
    }
    @Override
    public String toString() {
        return this.theme + " pendant " + this.nbHeures + " heures";
    }
}
