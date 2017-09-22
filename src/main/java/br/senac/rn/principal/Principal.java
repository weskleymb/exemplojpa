package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;

public class Principal {
    
    public static void main(String[] args) {

        System.out.println(new CategoriaDAO().selectAll());

        System.exit(0);
        
    }
    
}
