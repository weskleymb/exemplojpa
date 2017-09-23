package br.senac.rn.principal;

import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.dao.VendaDAO;
import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;
import br.senac.rn.model.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        Venda venda = new Venda();
        
        Cliente cliente = new ClienteDAO().insert(new Cliente("Weskley Bezerra", "03525373457", new SexoDAO().insert(new Sexo("Masculino", 'M'))));
        
        List<Produto> produtos = new ArrayList();
        
        produtos.add(new ProdutoDAO().insert(new Produto("Bola", "Bola de futebol", 100.0f, new CategoriaDAO().insert(new Categoria("Esportes", "Esportes abertos")))));
        produtos.add(new ProdutoDAO().insert(new Produto("TV 43''", "TV de led", 2000.0f, new CategoriaDAO().insert(new Categoria("ELetrônicos", "Eletrodométicos")))));
        produtos.add(new ProdutoDAO().insert(new Produto("Camisa Polo", "Camisa manga longa", 85.0f, new CategoriaDAO().insert(new Categoria("Vestuario", "Casual")))));
        
        venda.setCliente(cliente);
        venda.setData(Calendar.getInstance());
        venda.setProdutos(produtos);
        
        new VendaDAO().insert(venda);

        System.exit(0);
        
    }
    
}
