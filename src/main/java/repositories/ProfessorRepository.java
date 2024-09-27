package repositories;

import models.Professor;

import java.util.List;

public interface ProfessorRepository {
    void adicionaProfessor(Professor professor);
    void atualizaProfessor(int index, Professor professor);
    void deletaProfessor(int index);
    List<Professor> retornaLista();
}
