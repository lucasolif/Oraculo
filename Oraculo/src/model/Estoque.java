
package model;

import java.util.Objects;


public class Estoque extends Entidades{

    public Estoque(String descricao, String dataCadastro) {
        super(descricao, dataCadastro);
    }

    public Estoque(String descricao, String dataCadastro, int codigo) {
        super(descricao, dataCadastro, codigo);
    }

    public Estoque(String descricao, int codigo) {
        super(descricao, codigo);
    }

    public Estoque() {
    }

    public Estoque getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   

}
