package eu.ensup.etablissementScolaireSpring.controller;

import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import eu.ensup.etablissementScolaireSpring.domaine.Responsable;
import eu.ensup.etablissementScolaireSpring.service.EtudiantService;
import eu.ensup.etablissementScolaireSpring.service.Responsableservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class ResponsableController {
    @Autowired
    Responsableservice responsableservice;

    @GetMapping("/")
    public String home() {
        return "Bienvenue sur l'application spring Gestion d'un établissement scolaire  /chérif Bachir/ !";
    }


    @GetMapping("/responsables")
    public String etudiants(Model model) {

        List<Responsable> listResponsable = responsableservice.getResponsables();

        if (listResponsable != null) {
            model.addAttribute("responsable", listResponsable);
        }
        return "listResponsable";
    }

    @GetMapping("/responsable/{id}")
    public String employeById(@PathVariable("id") String id) {
        try {
            Responsable responsable1 = responsableservice.getResponsableById( Integer.parseInt(id) );
            return responsable1.toString();
        }
        catch(EntityNotFoundException enfe) {
            return "Aucune etudiant n'existe avec l'id : " + id;
        }
    }
}
