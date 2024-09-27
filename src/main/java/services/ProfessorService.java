package services;

import models.Professor;
import repositories.ProfessorRepository;

import java.util.List;

public class ProfessorService {
    private ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public void adicionaProfessor(Professor professor){
        professorRepository.adicionaProfessor(professor);
    }

    public void atualizaProfessor(int index, Professor professor){
        professorRepository.atualizaProfessor(index, professor);
    }

    public void deletaProfessor(int index){
        professorRepository.deletaProfessor(index);
    }

    public List<Professor> retornaLista(){
        return professorRepository.retornaLista();
    }
}
