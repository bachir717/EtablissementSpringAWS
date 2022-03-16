package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.Directeur;
import eu.ensup.etablissementScolaireSpring.domaine.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirecteurDao extends JpaRepository<Directeur, Integer> {
}
