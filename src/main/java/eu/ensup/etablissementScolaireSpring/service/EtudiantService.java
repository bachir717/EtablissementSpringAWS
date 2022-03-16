package eu.ensup.etablissementScolaireSpring.service;

import eu.ensup.etablissementScolaireSpring.dao.EtudiantDao;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired
    EtudiantDao etudiantDao;


    public Etudiant getEtudiantById(int id) {
        return etudiantDao.getById(id);
    }

    public List<Etudiant> getEtudiants() {
        return etudiantDao.findAll();
    }
}
