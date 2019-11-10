package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.ProdutoDAO;
import br.com.gx2.dao.imp.ProdutoDAOImp;
import br.com.gx2.entity.Produto;
import br.com.gx2.service.ProdutoService;

public class ProdutoServiceImp implements ProdutoService {

//	@Override
	public boolean create(Produto produto) {
		try {
			ProdutoDAO dao = new ProdutoDAOImp();
			dao.create(produto);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Produto produto) {
		try {
			ProdutoDAO dao = new ProdutoDAOImp();
			dao.update(produto);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Produto produto) {
		try {
			ProdutoDAO dao = new ProdutoDAOImp();
			dao.delete(produto);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Produto findById(Produto produto) {
		Produto response = new Produto();
		try {
			ProdutoDAO dao = new ProdutoDAOImp();
			response = dao.findById(produto.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Produto> listAll() {
		List<Produto> response = new ArrayList<Produto>();
		try {
			ProdutoDAO dao = new ProdutoDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
