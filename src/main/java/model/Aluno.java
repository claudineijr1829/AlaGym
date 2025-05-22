
package model;

public class Aluno extends Usuario{
    private float peso;
    private float altura;
    private boolean statusPagamento;

    public Aluno(String nome, String email, String senha, String endereco, int telefone, String permissao, int idade, char sexo, float peso, float altura, boolean statusPagamento) {
        super(nome, email, senha, endereco, telefone, permissao, idade, sexo);
        this.peso = peso;
        this.altura = altura;
        this.statusPagamento = statusPagamento;
    }
    
    public void visualizarHistoricoAvaliacoes(){
    //responsavel por visualizar o historio das avaliacoes fisicas
        System.out.println("Histórico de Avalições");
    }
    
    public void visualizarTreinosCadastrados(){
    //responsavel por visuzalizar os treinos cadastrados 
        System.out.println("Treinos do aluno");
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }


    
}
