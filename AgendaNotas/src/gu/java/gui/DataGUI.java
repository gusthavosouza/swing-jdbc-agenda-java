package gu.java.gui;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */
import javax.swing.JComboBox;
import javax.swing.JPanel;

import java.util.ArrayList;

public class DataGUI extends JPanel{
	private JComboBox comboDia;
	private JComboBox comboMes;
	private JComboBox comboAno;
	private JPanel montaDia;

	public JPanel montaData() {
		JPanel montaDia = new JPanel();
		ArrayList<Integer> dia = new ArrayList<Integer>();
		for (int x = 1; x <= 31; x++) {
			dia.add(x);
		}
		comboDia = new JComboBox(dia.toArray());

		ArrayList<Integer> ano = new ArrayList<Integer>();
		for (int x = 2013; x <= 2020; x++) {
			ano.add(x);

		}
		comboAno = new JComboBox(ano.toArray());

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

		comboMes = new JComboBox(mes.toArray());
		montaDia.add(comboDia);
		montaDia.add(comboMes);
		montaDia.add(comboAno);

		return montaDia;
	}

}
