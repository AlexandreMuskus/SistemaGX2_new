package br.com.gx2.service.imp;

import java.util.ArrayList;
import java.util.List;

import br.com.gx2.dao.ContatoDAO;
import br.com.gx2.dao.imp.ContatoDAOImp;
import br.com.gx2.entity.Contato;
import br.com.gx2.service.ContatoService;

public class ContatoServiceImp implements ContatoService {

//	@Override
	public boolean create(Contato contato) {
		try {
			ContatoDAO dao = new ContatoDAOImp();
			dao.create(contato);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}

//	@Override
	public boolean update(Contato contato) {
		try {
			ContatoDAO dao = new ContatoDAOImp();
			dao.update(contato);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public boolean delete(Contato contato) {
		try {
			ContatoDAO dao = new ContatoDAOImp();
			dao.delete(contato);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

//	@Override
	public Contato findById(Contato contato) {
		Contato response = new Contato();
		try {
			ContatoDAO dao = new ContatoDAOImp();
			response = dao.findById(contato.getId());
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	@Override
	public List<Contato> listAll() {
		List<Contato> response = new ArrayList<Contato>();
		try {
			ContatoDAO dao = new ContatoDAOImp();
			response = dao.listAll();
			return response;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
