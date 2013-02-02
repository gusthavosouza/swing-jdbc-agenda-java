package gu.java.nota;
/* Desenvolvido por Gustavo de Souza 28.01.2013
 * Projeto para criação de notas e eventos do dia-a-dia.
 */
import java.util.Date;

public class Nota {
	private String nome;
	private String descricao;
	private String evento;
	private String local;
	private int prioridade;
	private Date data;
	public Nota(String nome, String descricao, String evento, String local, int prioridade) {
		this.nome = nome;
		this.descricao =  descricao;
		this.evento = evento;
		this.local = local;
		this.prioridade = prioridade;
	}
		public Nota(String nome, String descricao, String evento, String local) {
			this.nome = nome;
			this.descricao =  descricao;
			this.evento = evento;
			this.local = local;
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public String getEvento() {
			return evento;
		}
		public void setEvento(String evento) {
			this.evento = evento;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public int getPrioridade() {
			return prioridade;
		}
		public void setPrioridade(int prioridade) {
			this.prioridade = prioridade;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return "Nota [nome=" + getNome() + ", descricao=" +getDescricao()
					+ ", evento=" + getEvento() + "]";
		}
	}
	
	
	