package usjt.olimpiada.service;

import usjt.olimpiada.dao.OlimpiadaDAO;
import usjt.olimpiada.model.Olimpiada;

public class OlimpiadaService {

	OlimpiadaDAO dao = new OlimpiadaDAO();
	
	public int geraId(int ano, int modalidade, int pais) {
		String id = ""+ano+""+modalidade+""+pais;
		
		return Integer.parseInt(id);
	}
	
	public boolean criar(Olimpiada olimpiada, int ano, int modalidade, int pais ) {
		olimpiada.setId(geraId(ano, modalidade, pais));
		return dao.criar(olimpiada);
	}
	
	public void atualizar(Olimpiada olimpiada) {
		dao.atualiza(olimpiada);
	}

	public boolean excluir(int idOlimpiada) {
		return dao.excluir(idOlimpiada);
	}

	public Olimpiada carregar(int idOlimpiada) {
		return dao.carregar(idOlimpiada);
	}
	
	/**
	 * Olhar o comentario na classe DAO.
	 * @return
	 * @throws IOException
	 */
	/*public ArrayList<Olimpiada> buscaAnos() throws IOException {
		return dao.buscaAnos();
	}*/
	
}
