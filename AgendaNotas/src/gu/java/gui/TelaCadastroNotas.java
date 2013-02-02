package gu.java.gui;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */
import gu.java.nota.Nota;
import gu.java.gui.DataGUI;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroNotas extends JPanel {

	private Button bAdcionar;
	private Button bExcluir;
	private Button bNovo;
	private Button bEditar;
	private Button bSalvar;

	private JLabel lNome;
	private JTextField tfNome;

	private JLabel lDescricao;
	private JTextField tfDescricao;

	private JLabel lEvento;
	private JTextField tfEvento;

	private JLabel lLocal;
	private TextField tfLocal;

	private JPanel adicionarNota;
	private JPanel cadastroBotao;
	private JPanel montaData;
	private JComboBox combo;
	private ComboBoxEditor cDia;
	private ComboBoxEditor cMes;

	public TelaCadastroNotas() {

		this.setLayout(new BorderLayout());
		adicionarNota = montaTelaNota();
		cadastroBotao = montaTelaBotao();
		montaData = montaData();
		this.add(montaData, BorderLayout.CENTER);
		this.add(adicionarNota, BorderLayout.NORTH);
		this.add(cadastroBotao, BorderLayout.SOUTH);
	}

	private JPanel montaTelaBotao() {
		// TODO Auto-generated method stub
		JPanel cadastroBotao = new JPanel();
		bSalvar = new Button("Salvar");
		cadastroBotao.add(bSalvar);

		bExcluir = new Button("Excluir");
		cadastroBotao.add(bExcluir);

		bNovo = new Button("Novo");
		cadastroBotao.add(bNovo);

		bEditar = new Button("Editar");
		cadastroBotao.add(bEditar);

		return cadastroBotao;
	}

	private JPanel montaTelaNota() {
		JPanel adicionarNota = new JPanel();
		GridLayout layou = new GridLayout(15, 1);
		adicionarNota.setLayout(layou);
		combo = new JComboBox();

		lDescricao = new JLabel("Descrição");
		tfDescricao = new JTextField();

		lNome = new JLabel("Nome");
		tfNome = new JTextField();

		lEvento = new JLabel("Evento");
		tfEvento = new JTextField();

		lLocal = new JLabel("Local:");
		tfLocal = new TextField();

		adicionarNota.add(combo);
		adicionarNota.add(lDescricao);
		adicionarNota.add(tfDescricao);
		adicionarNota.add(lNome);
		adicionarNota.add(tfNome);
		adicionarNota.add(lEvento);
		adicionarNota.add(tfEvento);
		adicionarNota.add(lLocal);
		adicionarNota.add(tfLocal);

		return adicionarNota;
	}

	public void carregarNota(Nota nota) {
		if (nota != null) {
			System.out.println("carregando nota");
			this.tfNome.setText(nota.getNome());
			this.tfDescricao.setText(nota.getDescricao());
			this.tfLocal.setText(nota.getLocal());
			this.tfEvento.setText(nota.getEvento());

		}
	}

	public JPanel montaData() {
		JPanel montaDia = new JPanel();
		JLabel lDia = new JLabel("Dia");
		JLabel lMes = new JLabel("Mes");
		JLabel lAno = new JLabel("Ano");
		ArrayList<Integer> dia = new ArrayList<Integer>();
		for (int x = 1; x <= 31; x++) {
			dia.add(x);
		}
		JComboBox comboDia = new JComboBox(dia.toArray());

		ArrayList<Integer> ano = new ArrayList<Integer>();
		for (int x = 2013; x <= 2020; x++) {
			ano.add(x);

		}
		JComboBox comboAno = new JComboBox(ano.toArray());

		ArrayList<String> mes = new ArrayList<String>();
		mes.add("Janeiro");
		mes.add("Fevereiro");
		mes.add("Março");
		mes.add("Abril");
		mes.add("Maio");
		mes.add("Junho");
		mes.add("Julho");
		mes.add("Agosto");
		mes.add("Setembro");
		mes.add("Outubro");
		mes.add("Novembro");
		mes.add("Dezembro");

		for (int x = 0; x < mes.size(); x++) {

		}

		JComboBox comboMes = new JComboBox(mes.toArray());
		
		montaDia.add(lDia);
		montaDia.add(comboDia);
		montaDia.add(lMes);
		montaDia.add(comboMes);
		montaDia.add(lAno);
		montaDia.add(comboAno);

		return montaDia;
	}


	}



class ExcluirNotaListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	class CarregarNota implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// TODO Auto-generated method stub

		}

	}

}
