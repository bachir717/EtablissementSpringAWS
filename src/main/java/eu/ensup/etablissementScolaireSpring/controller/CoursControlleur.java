package eu.ensup.etablissementScolaireSpring.controller;

import eu.ensup.etablissementScolaireSpring.domaine.Cours;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import eu.ensup.etablissementScolaireSpring.service.CoursService;
import eu.ensup.etablissementScolaireSpring.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class CoursControlleur {
    @Autowired
    CoursService  coursService;

    @GetMapping("/")
    public String home() {
        return "Bienvenue sur l'application spring Gestion d'un établissement scolaire  /chérif Bachir/ !";
    }


    @GetMapping("/courss")
    public String etudiants(Model model) {

        List<Cours> listCours = coursService.getCours();

        if (listCours != null) {
            model.addAttribute("cours", listCours);
        }
        return "listCours";
    }

    @GetMapping("/cours/{id}")
    public String employeById(@PathVariable("id") String id) {
        try {
            Cours cours1 = coursService.getCoursById( Integer.parseInt(id) );
            return cours1.toString();
        }
        catch(EntityNotFoundException enfe) {
            return "Aucune etudiant n'existe avec l'id : " + id;
        }
    }
}
