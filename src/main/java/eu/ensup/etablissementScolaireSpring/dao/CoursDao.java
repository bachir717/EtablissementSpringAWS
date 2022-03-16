package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.Cours;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursDao extends JpaRepository<Cours, Integer> {
    public List<Cours> findByTheme(String theme);
}
