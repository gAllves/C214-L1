package models;

public class Professor {

    private String nome;
    private String materia;
    private int idade;

    //Construtor
    public Professor(String nome, String materia, int idade) {
        this.nome = nome;
        this.materia = materia;
        this.idade = idade;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
