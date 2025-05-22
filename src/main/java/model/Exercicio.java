
package model;


public class Exercicio {
    private String musculo;
    private String nome;
    private String descricao;

    public Exercicio(String musculo, String nome, String descricao) {
        this.musculo = musculo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getMusculo() {
        return musculo;
    }

    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
