package eu.ensup.etablissementScolaireSpring.domaine;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Directeur")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Directeur extends eu.ensup.etablissementScolaireSpring.domaine.Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private List<Etablissement> etablissements = new ArrayList<>();

    /**
     * Instantiates a new Directeur.
     */
    public Directeur() {
    }

    /**
     * Instantiates a new Directeur.
     *
     * @param id             the id
     * @param nom            the nom
     * @param email          the email
     * @param adresse        the adresse
     * @param telephone      the telephone
     * @param prenom         the prenom
     * @param motDePasse     the mot de passe
     * @param salt           the salt
     * @param etablissements the etablissements
     */
    public Directeur(int id, String nom, String email, String adresse, String telephone, String prenom, String motDePasse, String salt, List<Etablissement> etablissements) {
        super(id, nom, email, adresse, telephone, prenom, motDePasse, salt);
        this.etablissements = etablissements;
    }

    @Override
    public String toString() {
        return super.toString() + "etablissements=" + etablissements + '\n';
    }
}
