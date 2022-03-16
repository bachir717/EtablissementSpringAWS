package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "PersonnePysique")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class PersonnePhysique extends eu.ensup.etablissementScolaireSpring.domaine.Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String prenom;
    private String motDePasse;
    private String salt;

    /**
     * Instantiates a new Personne physique.
     */
    public PersonnePhysique() {
    }

    /**
     * Instantiates a new Personne physique.
     *
     * @param id         the id
     * @param nom        the nom
     * @param email      the email
     * @param adresse    the adresse
     * @param telephone  the telephone
     * @param prenom     the prenom
     * @param motDePasse the mot de passe
     * @param salt       the salt
     */
    public PersonnePhysique(int id,String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt) {
        super(id,nom, email, adresse, telephone);
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.salt = salt;
    }

    /**
     * Instantiates a new Personne physique.
     *
     * @param nom        the nom
     * @param email      the email
     * @param adresse    the adresse
     * @param telephone  the telephone
     * @param prenom     the prenom
     * @param motDePasse the mot de passe
     * @param salt       the salt
     */
    public PersonnePhysique(String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt) {
        super(nom, email, adresse, telephone);
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.salt = salt;
    }
    @Override
    public String toString() {

        return super.toString() + "prenom=" + prenom + '\n' +
                "mot de passe=" + motDePasse + '\n' +
                "salt=" + salt + '\n' ;
    }
}
