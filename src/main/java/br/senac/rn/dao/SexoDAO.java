package br.senac.rn.dao;

import br.senac.rn.model.Sexo;
import br.senac.rn.util.GenericDAO;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
}
