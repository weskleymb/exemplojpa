package br.senac.rn.dao;

import br.senac.rn.model.Produto;
import br.senac.rn.util.GenericDAO;

public class ProdutoDAO extends GenericDAO<Produto> {

    @Override
    public Class<Produto> getClassType() {
        return Produto.class;
    }

}
