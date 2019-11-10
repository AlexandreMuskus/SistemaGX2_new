package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.CidadeDAO;
import br.com.gx2.dao.imp.CidadeDAOImp;
import br.com.gx2.entity.Cidade;
import br.com.gx2.service.CidadeService;

public class CidadeServiceImp implements CidadeService {

//	@Override
	public boolean create(Cidade cidade) {
		try {
			CidadeDAO dao = new CidadeDAOImp();
			dao.create(cidade);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Cidade cidade) {
		try {
			CidadeDAO dao = new CidadeDAOImp();
			dao.update(cidade);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Cidade cidade) {
		try {
			CidadeDAO dao = new CidadeDAOImp();
			dao.delete(cidade);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Cidade findById(Cidade cidade) {
		Cidade response = new Cidade();
		try {
			CidadeDAO dao = new CidadeDAOImp();
			response = dao.findById(cidade.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Cidade> listAll() {
		List<Cidade> response = new ArrayList<Cidade>();
		try {
			CidadeDAO dao = new CidadeDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
