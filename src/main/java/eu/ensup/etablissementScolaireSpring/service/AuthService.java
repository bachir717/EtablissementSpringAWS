package eu.ensup.etablissementScolaireSpring.service;

import eu.ensup.etablissementScolaireSpring.dao.ResponsableDao;
import eu.ensup.etablissementScolaireSpring.domaine.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthService {
    @Autowired
    private ResponsableDao responsableDao;

    @Autowired
    private PasswordEncoder passwordEncoder;


}
