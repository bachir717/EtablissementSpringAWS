package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Etudiant")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Etudiant extends PersonnePhysique{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.sql.Date dateNaissance;
    private List<Cours> cours = new ArrayList<Cours>();

    /**
     * Instantiates a new Etudiant.
     *
     * @param id            the id
     * @param nom           the nom
     * @param email         the email
     * @param adresse       the adresse
     * @param telephone     the telephone
     * @param prenom        the prenom
     * @param motDePasse    the mot de passe
     * @param salt          the salt
     * @param dateNaissance the date naissance
     */
    public Etudiant(int id,String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt, java.sql.Date dateNaissance) {
        super(id, nom, email, adresse, telephone, prenom, motDePasse, salt);

        this.dateNaissance = dateNaissance;
    }

    /**
     * Instantiates a new Etudiant.
     *
     * @param nom           the nom
     * @param email         the email
     * @param adresse       the adresse
     * @param telephone     the telephone
     * @param prenom        the prenom
     * @param motDePasse    the mot de passe
     * @param salt          the salt
     * @param dateNaissance the date naissance
     */
    public Etudiant(String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt, java.sql.Date dateNaissance) {
        super( nom, email, adresse, telephone, prenom, motDePasse, salt);

        this.dateNaissance = dateNaissance;
    }


    /**
     * Instantiates a new Etudiant.
     */
    public Etudiant() {
    }



    @Override
    public String toString() {
        String res = super.toString() + "Etudiant{" +
                "dateNaissance=" + dateNaissance +
                ", cours=" + cours +
                '}';

        return res;


    }

}
