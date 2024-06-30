
package model;


public class FormaPagto extends Entidades{

    public FormaPagto(String descricao, String dataCadastro) {
        super(descricao, dataCadastro);
    }

    public FormaPagto(String descricao, String dataCadastro, int codigo) {
        super(descricao, dataCadastro, codigo);
    }

    public FormaPagto(String descricao, int codigo) {
        super(descricao, codigo);
    }

    public FormaPagto() {
    }


    
}
