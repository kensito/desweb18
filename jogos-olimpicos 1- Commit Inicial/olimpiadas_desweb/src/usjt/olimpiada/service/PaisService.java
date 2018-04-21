package usjt.olimpiada.service;

import java.io.IOException;
import java.util.ArrayList;

import usjt.olimpiada.dao.PaisDAO;
import usjt.olimpiada.model.Pais;

public class PaisService {

	PaisDAO paisDAO = new PaisDAO();
	
	public void criar(Pais pais) {
		paisDAO.criar(pais);
	}
	
	public void atualizar(Pais pais) {
		paisDAO.atualiza(pais);
	}

	public void excluir(Pais pais) {
		paisDAO.excluir(pais);
	}

	public void carregar(Pais pais) {
		paisDAO.carregar(pais);
	}
	
	public ArrayList<Pais> buscaPaises() throws IOException {
		return paisDAO.buscaPaises();
	}
}
