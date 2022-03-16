package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import eu.ensup.etablissementScolaireSpring.domaine.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatiereDao extends JpaRepository<Matiere, Integer> {
    public List<Etudiant> findByLibelle(String libelle);
}
