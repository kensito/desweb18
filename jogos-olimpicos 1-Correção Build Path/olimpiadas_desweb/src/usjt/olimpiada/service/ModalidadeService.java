package usjt.olimpiada.service;

import java.io.IOException;
import java.util.ArrayList;

import usjt.olimpiada.dao.ModalidadeDAO;
import usjt.olimpiada.model.Modalidade;

public class ModalidadeService {

	ModalidadeDAO dao = new ModalidadeDAO();
	
	public void criar(Modalidade modalidade) {
		dao.criar(modalidade);
	}
	
	public void atualizar(Modalidade modalidade) {
		dao.atualiza(modalidade);
	}

	public void excluir(Modalidade modalidade) {
		dao.excluir(modalidade);
	}

	public void carregar(Modalidade modalidade) {
		dao.carregar(modalidade);
	}
	
	public ArrayList<Modalidade> buscaModalidades() throws IOException{
		return dao.buscaModalidades();
	}
}
