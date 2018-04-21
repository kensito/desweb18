package usjt.olimpiada.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import usjt.olimpiada.model.Pais;
import usjt.olimpiada.service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTeste {
	Pais pais, copia;
	static int id = 0;
	PaisService paisService; 
	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se tambem que sobrecarregou o equals na classe
	 * Pais. 
	 * Certifique-se que a fixture pais1 foi criada no banco.
	 * Alem disso, a ordem de execucao dos testes eh importante; por
	 * isso a anotacao FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		
		paisService = new PaisService ();
		
		System.out.println("setup");
		pais = new Pais(id, "flu", 200,200.00 );
		copia = new Pais(id,"flu", 200,200.00);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Pais fixture = new Pais(1, "Brasil", 100, 100.00);
		Pais novo = new Pais(1, null, 0, 0);
		paisService.carregar(novo);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		paisService.criar(pais);
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setArea(250);
		copia.setArea(250);		
		paisService.atualizar(pais);
		paisService.carregar(pais);
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setArea(0);
		copia.setPopulacao(0);
		paisService.excluir(pais);
		paisService.carregar(pais);
		assertEquals("testa exclusao", pais, copia);
	}
}