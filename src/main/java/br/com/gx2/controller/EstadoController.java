package br.com.gx2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.gx2.entity.Estado;
import br.com.gx2.service.EstadoService;
import br.com.gx2.service.imp.EstadoServiceImp;

@ManagedBean
public class EstadoController {

	private Estado estadoSelecionado;
	private EstadoService service;
	private List<Estado> estados = new ArrayList<>();

	public EstadoController() {
		estadoSelecionado = new Estado();
		service = new EstadoServiceImp();
		estados = service.listAll();
	}

	public List<Estado> getEstados() {
		return estados;
	}
	
	public Estado getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void salvar() {

		boolean operacao = false;

		if (estadoSelecionado.getId() == null) {

			operacao = service.create(estadoSelecionado);
			estadoSelecionado = new Estado();
			estados = service.listAll();

			if (operacao == true) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Estado cadastrado com sucesso!", "Estado cadastrado com sucesso!"));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Erro ao tentar salvar o Estado!", "Erro ao tentar salvar o estado!"));
			}

		} else {

			operacao = service.update(estadoSelecionado);
			estadoSelecionado = new Estado();
			estados = service.listAll();

			if (operacao == true) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Estado alterado com sucesso!", "Estado alterado com sucesso!"));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Erro ao tentar alterar o estado!", "Erro ao tentar alterar o estado!"));
			}

		}

	}

	public void alterar() {
		boolean operacao = false;
		if (!estados.contains(estadoSelecionado)) {
			operacao = service.update(estadoSelecionado);
			estadoSelecionado = new Estado();
			estados = service.listAll();
			if (operacao == true) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Estado alterado com sucesso!", "Estado alterado com sucesso!"));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Erro ao tentar alterar o estado!", "Erro ao tentar alterar o estado!"));
			}

		}

	}

	public void excluir() {

		boolean operacao = false;

		operacao = service.delete(estadoSelecionado);
		estadoSelecionado = new Estado();
		estados = service.listAll();

		if (operacao == true) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Estado excluído com sucesso!", "Estado excluído com sucesso!"));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro ao tentar apagar o estado!", "Erro ao tentar apagar o estado!"));
		}

	}

	public void pesquisar() {
		if (estadoSelecionado.getId() != null) {
			Estado result = service.findById(estadoSelecionado);
			estados = new ArrayList<>();
			estados.add(result);
			estadoSelecionado = result;// new Agendamento();
			if (estadoSelecionado.getId() == null) {

				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Nenhum registro localizado!"));
			}

		} else {

			estados = service.listAll();
		}

	}

	public void limpar() {
		estadoSelecionado = new Estado();
		estados = new ArrayList<>();
	}

	public void setEstadoSelecionado(Estado estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
}