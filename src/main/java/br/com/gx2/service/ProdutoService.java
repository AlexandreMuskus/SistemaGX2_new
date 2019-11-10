package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Produto;

public interface ProdutoService {

	public boolean create(Produto produto);
	
	public boolean update(Produto produto);
	
	public boolean delete(Produto produto);
	
	public Produto findById(Produto produto);
	
	public List<Produto> listAll();
	
}
