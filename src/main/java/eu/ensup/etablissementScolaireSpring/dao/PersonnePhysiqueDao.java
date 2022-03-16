package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.PersonnePhysique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnePhysiqueDao extends JpaRepository<PersonnePhysique, Integer> {
}
