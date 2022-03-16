package eu.ensup.etablissementScolaireSpring.service;

import eu.ensup.etablissementScolaireSpring.dao.EtudiantDao;
import eu.ensup.etablissementScolaireSpring.dao.ResponsableDao;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import eu.ensup.etablissementScolaireSpring.domaine.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Responsableservice {
    @Autowired
    ResponsableDao responsableDao ;


    public Responsable getResponsableById(int id) {
        return responsableDao.getById(id);
    }

    public List<Responsable> getResponsables() {
        return responsableDao.findAll();
    }
}
