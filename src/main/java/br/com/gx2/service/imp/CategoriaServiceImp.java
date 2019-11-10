package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.CategoriaDAO;
import br.com.gx2.dao.imp.CategoriaDAOImp;
import br.com.gx2.entity.Categoria;
import br.com.gx2.service.CategoriaService;

public class CategoriaServiceImp implements CategoriaService {

//	@Override
	public boolean create(Categoria categoria) {
		try {
			CategoriaDAO dao = new CategoriaDAOImp();
			dao.create(categoria);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Categoria categoria) {
		try {
			CategoriaDAO dao = new CategoriaDAOImp();
			dao.update(categoria);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Categoria categoria) {
		try {
			CategoriaDAO dao = new CategoriaDAOImp();
			dao.delete(categoria);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Categoria findById(Categoria categoria) {
		Categoria response = new Categoria();
		try {
			CategoriaDAO dao = new CategoriaDAOImp();
			response = dao.findById(categoria.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Categoria> listAll() {
		List<Categoria> response = new ArrayList<Categoria>();
		try {
			CategoriaDAO dao = new CategoriaDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
