package eu.ensup.etablissementScolaireSpring.domaine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "NoteEleve")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class NoteEleve  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idNote;
    private Cours cours ;
    private eu.ensup.etablissementScolaireSpring.domaine.Etudiant etudiant;
    private float coeff;
    private float note ;

    public NoteEleve(float coeff, float note) {
        this.coeff = coeff;
        this.note = note;
    }

    public NoteEleve(int idNote, float coeff, float note) {
        this.idNote = idNote;
        this.coeff = coeff;
        this.note = note;
    }

    public NoteEleve() {
    }


    @Override
    public String toString() {
        return "NoteEleve{" +
                "idNote=" + idNote +
                ", cours=" + cours +
                ", etudiant=" + etudiant +
                ", coeff=" + coeff +
                ", note=" + note +
                '}';
    }
}