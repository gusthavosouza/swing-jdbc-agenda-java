package gu.java.nota;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */
import gu.java.conexao.Conexao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import gu.java.nota.*;

public class NotaDB {
	public void criarTabela() throws GuException {
		Connection conn = Conexao.getConexao();
		java.sql.Statement stm = null;
		String sql = "CREATE TABLE IF NOT EXISTS notas";

		sql += "nome varchar(30) NOT_NULL";
		sql += "descricao varchar(50) NOT_NULL";

		try {
			stm = (java.sql.Statement) conn.createStatement();
			((java.sql.Statement) stm).executeUpdate(sql);
			System.out.println("Tabela criada com sucesso");
		} catch (SQLException e) {
			throw new GuException("Erro na criação da tabela");
		} finally {

			Conexao.closeAll(conn, stm);

		}
	}

	public void salvar(Nota nota) throws GuException {
		java.sql.Statement stm = null;
		String sql = null;
		if (nota.getNome().equals(nota)) {
			sql = "INSERT INTO  notas (nome,descricao,evento,local,";
			sql += "VALUES ('" + nota.getNome() + "',";
			sql += nota.getDescricao();

		} else {
			sql += "UPDATE produtos SET nome = '" + nota.getNome() + "',";
			sql += "descricao = " + nota.getDescricao() + "',";
			sql += nota.getNome() + "',";
		}
		Connection conn = Conexao.getConexao();

		try {
			stm = conn.createStatement();
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			throw new GuException("Erro na execução da query");
		} finally {
			Conexao.closeAll(conn, stm);
		}

	}

}
