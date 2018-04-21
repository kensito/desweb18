package usjt.olimpiada.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import usjt.olimpiada.model.Modalidade;

public class ModalidadeDAO {

	public void criar(Modalidade modalidade) {
		String sqlInsert = "INSERT INTO modalidade(nome, tipo) VALUES (?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, modalidade.getNome());
			stm.setString(2, String.valueOf(modalidade.getTipo()));
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery); ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					modalidade.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualiza(Modalidade modalidade) {
		String sqlUpdate = "UPDATE modalidade SET nome=?, tipo=? WHERE id_modalidade=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, modalidade.getNome());
			stm.setString(2, String.valueOf(modalidade.getTipo()));
			stm.setInt(3, modalidade.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Modalidade modalidade) {
		String sqlDelete = "DELETE FROM modalidade WHERE id_modalidade = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, modalidade.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void carregar(Modalidade modalidade) {
		String sqlSelect = "SELECT nome, tipo, id_modalidade FROM modalidade WHERE id_modalidade = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, modalidade.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					modalidade.setNome(rs.getString("nome"));
					modalidade.setTipo(rs.getString("tipo").charAt(0));
				} else {
					modalidade.setId(-1);
					modalidade.setNome(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}

	}

	public ArrayList<Modalidade> buscaModalidades() throws IOException {
		ArrayList<Modalidade> modalidades = new ArrayList<>();
		String sqlSelect = "SELECT id_modalidade, nome, tipo FROM modalidade";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			
			try (ResultSet rs = stm.executeQuery();) {
				
				while (rs.next()) {
					Modalidade modalidade = new Modalidade();
					modalidade.setId(rs.getInt("id_modalidade"));
					modalidade.setNome(rs.getString("nome"));
					modalidade.setTipo(rs.getString("tipo").charAt(0));
					modalidades.add(modalidade);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		
		return modalidades;
	}
}
