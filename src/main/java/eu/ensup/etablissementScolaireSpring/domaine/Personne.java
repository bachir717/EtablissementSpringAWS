package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "Personne")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String email;
    private String adresse;
    private String telephone;

    /**
     * Instantiates a new Personne.
     */
    public Personne() {
    }

    /**
     * Instantiates a new Personne.
     *
     * @param id        the id
     * @param nom       the nom
     * @param email     the email
     * @param adresse   the adresse
     * @param telephone the telephone
     */
    public Personne(int id,String nom, String email, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    /**
     * Instantiates a new Personne.
     *
     * @param nom       the nom
     * @param email     the email
     * @param adresse   the adresse
     * @param telephone the telephone
     */
    public Personne(String nom, String email, String adresse, String telephone) {
        this.nom = nom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "id=" + id + '\n' +
                "nom=" + nom + '\n' +
                "email=" + email + '\n' +
                "adresse=" + adresse + '\n' +
                "telephone=" + telephone + '\n';
    }


}
