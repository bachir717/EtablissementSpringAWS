package eu.ensup.etablissementScolaireSpring.service;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;

import eu.ensup.etablissementScolaireSpring.dao.EtudiantDao;
import eu.ensup.etablissementScolaireSpring.domaine.Etudiant;
import eu.ensup.etablissementScolaireSpring.exception.ServiceException;
import eu.ensup.etablissementScolaireSpring.exception.coursExceptions.GetCoursServiceException;
import eu.ensup.etablissementScolaireSpring.exception.directeurExceptions.GetDirecteurServiceException;
import eu.ensup.etablissementScolaireSpring.exception.enseignantExceptions.GetEnseignantServiceException;
import eu.ensup.etablissementScolaireSpring.exception.etudiantExceptions.GetEtudiantServiceException;
import eu.ensup.etablissementScolaireSpring.exceptions.DaoException;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */

@ExtendWith(MockitoExtension.class)
public class ServiceTest
{
    @Mock
    EtudiantDao etudiantDao;

    @InjectMocks
    EtudiantService etudiantService;

    // Test with a Mock, to be sure the service Etudiant work without dependending on the dao
    @Test
    public void TestGetEtudiantWithMock() {
        try {
            Etudiant cheriNotMocked = new Etudiant("Cherif", "Cherif.cherif@gmail.com", "80 B rue de Chartres", "0634779411", "thomas", "M25w6WUHN7hlLG1EEDioMrPdQVweE0qE4lr5vEBHg/M=", "hcjuvzSHHCg56u/kwr4gDZ1UWRQ=", new Date(new SimpleDateFormat("yyyy/MM/dd").parse("1999/08/23").getTime()));

            when(etudiantDao.getById(10)).thenReturn(cherifNotMocked);

            Etudiant cherifMocked = etudiantService.getEtudiantById(1);

            MatcherAssert.assertThat(cherifMocked.(), equalTo(cherifNotMocked.get()));

            verify(etudiantDao).getById(1);
        } catch (ParseException  e) {
            System.out.println("Une erreur est survenue");
        }
    }



    @Mock
    List mockedList;

    @Test
    public void mockArrayList() {
        mockedList.add("one");
        Mockito.verify(mockedList).add("one");
        MatcherAssert.assertThat(0, equalTo(spyList.size()) );
    }

    @Spy
    ArrayList spyList = new ArrayList();
    @Test
    public void spyArrayList() {
        spyList.add("one");
        Mockito.verify(spyList).add("one");

        MatcherAssert.assertThat(1, equalTo(spyList.size()) );
    }


}