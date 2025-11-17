
import org.junit.jupiter.api.Test;
import school.hei.components.*;
import java.time.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolGradesTest {

    @Test
    void testGetExamGrade() {
        Enseignant profAPI = new Enseignant(1, "Ryan", "Mr", LocalDate.of(1985,1,1), "ryan@email.com", "0123456789", "API");
        Cours api = new Cours();
        api.setId(4);
        api.setLabel("API");
        api.setCredits(4);
        api.setEnseignant(profAPI);

        Examen examAPI = new Examen(1, "Examen API", api, LocalDateTime.now(), 4);
        Note noteAPI = new Note();
        noteAPI.setValeurInitiale(14);

        Etudiant etu = new Etudiant(1, "Rakoto", "Jean", LocalDate.of(2001,5,20), "etu@email.com", "0987654321", "G1", "Tuteur1");
        etu.addNote(examAPI, noteAPI);

        assertEquals(14, etu.getExamGrade(examAPI, Instant.now()));
    }

    @Test
    void testGetCourseGrade() {
        Enseignant profDRTOKY = new Enseignant(2, "DrToky", "Mr", LocalDate.of(1975,3,15), "drtoky@email.com", "0123456789", "PROG1");
        Cours prog1 = new Cours();
        prog1.setId(1);
        prog1.setLabel("PROG1");
        prog1.setCredits(6);
        prog1.setEnseignant(profDRTOKY);

        Examen exProg1 = new Examen(1, "PROG1 Ex1", prog1, LocalDateTime.now(), 6);
        Note nProg1 = new Note();
        nProg1.setValeurInitiale(12);

        Enseignant profSYS1 = new Enseignant(3, "Rado", "Mr", LocalDate.of(1980,7,12), "mr.rado@email.com", "0123456789", "SYS1");
        Cours sys1 = new Cours();
        sys1.setId(2);
        sys1.setLabel("SYS1");
        sys1.setCredits(4);
        sys1.setEnseignant(profSYS1);

        Examen exSYS1 = new Examen(2, "SYS1 Ex1", sys1, LocalDateTime.now(), 4);
        Note nSYS1 = new Note();
        nSYS1.setValeurInitiale(15);

        Enseignant profSYS2 = new Enseignant(4, "Lou", "Dr", LocalDate.of(1978,6,10), "dr.lou@email.com", "0123456789", "SYS2");
        Cours sys2 = new Cours();
        sys2.setId(3);
        sys2.setLabel("SYS2");
        sys2.setCredits(8);
        sys2.setEnseignant(profSYS2);

        Examen exSYS2 = new Examen(3, "SYS2 Ex1", sys2, LocalDateTime.now(), 8);
        Note nSYS2 = new Note();
        nSYS2.setValeurInitiale(16);

        Etudiant etu = new Etudiant(1, "Rakoto", "Jean", LocalDate.of(2001,5,20), "etu@email.com", "0987654321", "G1", "Tuteur1");
        etu.addNote(exProg1, nProg1);
        etu.addNote(exSYS1, nSYS1);
        etu.addNote(exSYS2, nSYS2);

        assertEquals(12, etu.getCourseGrade(prog1, Instant.now()));
        assertEquals(15, etu.getCourseGrade(sys1, Instant.now()));
        assertEquals(16, etu.getCourseGrade(sys2, Instant.now()));
    }
}
