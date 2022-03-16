package eu.ensup.etablissementScolaireSpring.dao;

import eu.ensup.etablissementScolaireSpring.domaine.Etablissement;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtablissementDao extends JpaRepository<Etablissement, Integer> {
    public List<Etablissement> findByEmail(String email);
}
