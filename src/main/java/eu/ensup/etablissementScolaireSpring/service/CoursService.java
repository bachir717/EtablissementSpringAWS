package eu.ensup.etablissementScolaireSpring.service;

import eu.ensup.etablissementScolaireSpring.dao.CoursDao;
import eu.ensup.etablissementScolaireSpring.dao.EtudiantDao;
import eu.ensup.etablissementScolaireSpring.domaine.Cours;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursService {
    @Autowired
    CoursDao coursDao;


    public Cours getCoursById(int id) {
        return coursDao.getById(id);
    }

    public List<Cours> getCours() {
        return coursDao.findAll();
    }
}
