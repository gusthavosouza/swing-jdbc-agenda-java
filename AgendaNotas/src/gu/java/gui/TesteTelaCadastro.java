package gu.java.gui;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteTelaCadastro extends JFrame {

	public TesteTelaCadastro(String titulo) {
		super(titulo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			this.getContentPane().add(new TelaCadastroNotas());

			super.setSize(400, 500);
			this.setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(),
					"Mensgem de Erro", JOptionPane.OK_OPTION);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TesteTelaCadastro ttc = new TesteTelaCadastro("Teste Notas");
		ttc.setVisible(true);
	}
}
