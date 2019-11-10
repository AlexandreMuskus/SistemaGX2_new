package br.com.gx2.service;

import java.util.List;

import br.com.gx2.entity.Permissao;

public interface PermissaoService {

	public boolean create(Permissao permissao);
	
	public boolean update(Permissao permissao);
	
	public boolean delete(Permissao permissao);
	
	public Permissao findById(Permissao permissao);
	
	public List<Permissao> listAll();
	
}
