package br.senac.rn.dao;

import br.senac.rn.model.Venda;
import br.senac.rn.util.GenericDAO;

public class VendaDAO extends GenericDAO<Venda> {

    @Override
    public Class<Venda> getClassType() {
        return Venda.class;
    }
    
}
