package eu.ensup.etablissementScolaireSpring.controller;

import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import eu.ensup.etablissementScolaireSpring.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @GetMapping("/")
    public String home() {
        return "Bienvenue sur l'application spring Gestion d'un établissement scolaire  /chérif Bachir/ !";
    }


    @GetMapping("/etudiants")
    public String etudiants(Model model) {

        List<Etudiant> listEtudiant = etudiantService.getEtudiants();

        if (listEtudiant != null) {
            model.addAttribute("etudiant", listEtudiant);
        }
        return "listEtudiant";
    }

    @GetMapping("/etudiant/{id}")
    public String employeById(@PathVariable("id") String id) {
        try {
            Etudiant etudiant1 = etudiantService.getEtudiantById( Integer.parseInt(id) );
            return etudiant1.toString();
        }
        catch(EntityNotFoundException enfe) {
            return "Aucune etudiant n'existe avec l'id : " + id;
        }
    }
}
