package repositories;

import models.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepositoryMemory implements ProfessorRepository {

    //Lista dos professores para leitura
    private List<Professor> professores = new ArrayList<>();

    public void adicionaProfessor(Professor professor){
        professores.add(professor);
    }

    public void atualizaProfessor(int index, Professor professor){
        professores.set(index, professor);
    }

    public void deletaProfessor(int index){
        professores.remove(index);
    }

    public List<Professor> retornaLista(){
        return professores;
    }
}
