package br.senac.rn.dao;

import br.senac.rn.model.Cliente;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends GenericDAO<Cliente> {

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }
    
    public List<Cliente> buscarPorCpf(String cpf) {
        String jpql = "SELECT c FROM Cliente c WHERE c.cpf like :cpfCliente";
        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
        consulta.setParameter("cpfCliente", "%" + cpf + "%");
        return consulta.getResultList();
    }
    
}
