package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.NoteEleve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteEleveDao extends JpaRepository<NoteEleve, Integer> {
}
