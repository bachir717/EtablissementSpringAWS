package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Enseignant")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Enseignant extends eu.ensup.etablissementScolaireSpring.domaine.PersonnePhysique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String matiereEnseigne ;
    private List<eu.ensup.etablissementScolaireSpring.domaine.Cours>cours= new ArrayList<>();


    /**
     * Instantiates a new Enseignant.
     */
    public Enseignant() {

    }

    /**
     * Instantiates a new Enseignant.
     *
     * @param matiereEnseigne the matiere enseigne
     */
    public Enseignant(String matiereEnseigne) {
        this.matiereEnseigne = matiereEnseigne;
    }

    /**
     * Instantiates a new Enseignant.
     *
     * @param id              the id
     * @param nom             the nom
     * @param email           the email
     * @param adresse         the adresse
     * @param telephone       the telephone
     * @param prenom          the prenom
     * @param motDePasse      the mot de passe
     * @param salt            the salt
     * @param matiereEnseigne the matiere enseigne
     */
    public Enseignant(int id, String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt, String matiereEnseigne) {
        super(id, nom, email, adresse, telephone, prenom, motDePasse, salt);
        this.matiereEnseigne = matiereEnseigne;
    }

    /**
     * Instantiates a new Enseignant.
     *
     * @param nom             the nom
     * @param email           the email
     * @param adresse         the adresse
     * @param telephone       the telephone
     * @param prenom          the prenom
     * @param motDePasse      the mot de passe
     * @param salt            the salt
     * @param matiereEnseigne the matiere enseigne
     */
    public Enseignant( String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt, String matiereEnseigne) {
        super(nom, email, adresse, telephone, prenom, motDePasse, salt);
        this.matiereEnseigne = matiereEnseigne;
    }
}
