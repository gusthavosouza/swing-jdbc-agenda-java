package gu.java.nota;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */
import java.sql.SQLException;

public interface INotaDAO {
	
	abstract  void salval (Nota nota)  throws GuException, SQLException;
	
	abstract void excluir(Nota nota) throws GuException;
	
	abstract void editar(Nota nota) throws GuException;
	
	abstract void nova (Nota nota) throws GuException;

}
