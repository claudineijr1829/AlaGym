
package model;


public class Instrutor extends Usuario {
    private int cref;

    public Instrutor(String nome, String email, String senha, String endereco, int telefone, String permissao, int idade, char sexo, int cref) {
        super(nome, email, senha, endereco, telefone, permissao, idade, sexo);
        this.cref = cref;
    }

    public int getCref() {
        return cref;
    }

    public void setCref(int cref) {
        this.cref = cref;
    }
    
}
