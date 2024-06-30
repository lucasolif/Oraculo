
package model;


public class TipoCadastro extends Entidades {

    public TipoCadastro(String descricao, String dataCadastro) {
        super(descricao, dataCadastro);
    }

    public TipoCadastro(String descricao, String dataCadastro, int codigo) {
        super(descricao, dataCadastro, codigo);
    }

    public TipoCadastro(String descricao, int codigo) {
        super(descricao, codigo);
    }

    public TipoCadastro() {
    }

    
    
}
