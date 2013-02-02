package gu.java.nota;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */

import java.sql.Connection;
import java.sql.SQLException;

import gu.java.conexao.Conexao;
import gu.java.nota.Nota;
import com.mysql.jdbc.PreparedStatement;

public class NotaDAO implements INotaDAO{

	@Override
	public void salval(Nota nota) throws GuException, SQLException{
		// TODO Auto-generated method stub
		String sql = "INSERT into nota nome,descricao,evento,local";
		
		Connection conn = null;
		java.sql.PreparedStatement stm = null;
		try {
			conn = Conexao.getConexao();
			if (nota.getNome().equals((new Object()))) {
			stm = conn.prepareStatement(sql);
			} else {
				
			}
			Nota notaaa = new
					Nota("", "", "", "");
			stm.setString(1, notaaa.getNome());
			stm.setString(2, nota.getDescricao());
			stm.setString(3, nota.getEvento());
			stm.setString(4, nota.getLocal());
			Nota nota1 = new Nota("","","", "");
			stm.execute();
			stm.close();
		} catch (SQLException e ) {
			System.out.println("Falha ao Inserir no banco");
			e.printStackTrace();
			
		} 
	
	}

	@Override
	public void excluir(Nota nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Nota nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nova(Nota nota) {
		// TODO Auto-generated method stub
		
		
	}
	

}
