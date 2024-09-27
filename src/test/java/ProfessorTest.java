import models.Professor;
import org.junit.Before;
import org.junit.Test;
import repositories.ProfessorRepositoryMemory;
import services.ProfessorService;

import static org.junit.Assert.assertEquals;

public class ProfessorTest {

    ProfessorService professorService;
    ProfessorRepositoryMemory professorRepositoryMemory;

    //Setup a ser rodado antes de todos os testes
    @Before
    public void setup(){
        professorRepositoryMemory = new ProfessorRepositoryMemory();
        professorService = new ProfessorService(professorRepositoryMemory);
    }

    //Teste adicionando professor
    @Test
    public void testAddProfessor(){
        professorService.adicionaProfessor(new Professor("Chris", "codigos legais",35));
        assertEquals(1,professorService.retornaLista().size());
    }

    //Teste atualizando professor
    @Test
    public void testAtualizaProfessor(){
        professorService.adicionaProfessor(new Professor("Chris", "codigos legais",35));
        professorService.atualizaProfessor(0,new Professor("Chris","CODIGOS MUITO LEGAIS",34));
        assertEquals("CODIGOS MUITO LEGAIS",professorService.retornaLista().get(0).getMateria());
    }

    //Teste deletetando professor
    @Test
    public void testDeletaProfessor(){
        professorService.adicionaProfessor(new Professor("Chris", "codigos legais",35));
        professorService.adicionaProfessor(new Professor("Renzo", "pokemons e mario",40));
        professorService.deletaProfessor(0);
        assertEquals(1,professorService.retornaLista().size());
    }
}
