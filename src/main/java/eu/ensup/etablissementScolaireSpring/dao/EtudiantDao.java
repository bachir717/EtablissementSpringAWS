package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantDao extends JpaRepository<Etudiant, Integer> {
    public List<Etudiant> findByEmail(String email);
}
