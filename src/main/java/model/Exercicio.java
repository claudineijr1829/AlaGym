
package model;


public class Exercicio {
    private char musculo;
    private char nome;
    private char descricao;

    public Exercicio(char musculo, char nome, char descricao) {
        this.musculo = musculo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public char getMusculo() {
        return musculo;
    }

    public void setMusculo(char musculo) {
        this.musculo = musculo;
    }

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public char getDescricao() {
        return descricao;
    }

    public void setDescricao(char descricao) {
        this.descricao = descricao;
    }
    
}
