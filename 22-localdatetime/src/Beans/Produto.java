package Beans;

public class Produto {
	
		// ATRIBUTOS
		private String nome, data, hora;
		private int quantidade;
		private double valor;
		
		// SET & GET
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}						
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}			
}
