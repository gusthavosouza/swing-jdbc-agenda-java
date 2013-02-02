package gu.java.action;
import gu.java.nota.Nota;





public interface Action {

	void excluirListener(String nome);

	void novoListener();

	void editarListener();

	void salvarListener(Nota nota);

	

}
