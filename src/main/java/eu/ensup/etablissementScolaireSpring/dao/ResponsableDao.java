package eu.ensup.etablissementScolaireSpring.dao;
import eu.ensup.etablissementScolaireSpring.domaine.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsableDao extends JpaRepository<Responsable, Integer> {
    public List<Responsable> findByEmail(String email);
}
