package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.Enseignant;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnseignantDao extends JpaRepository<Enseignant, Integer> {
    public List<Enseignant> findByEmail(String email);
}
