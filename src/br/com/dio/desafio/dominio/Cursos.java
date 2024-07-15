package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {

		private String titulo;
		private String 	descricao;
		private int categoria;
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public int getCategoria() {
			return categoria;
		}
		public void setCategoria(int categoria) {
			this.categoria = categoria;
		}
		
		@Override
		public String toString() {
			return "Cursos [titulo=" + titulo + ", descricao=" + descricao + ", categoria=" + categoria + "]";
		}
		@Override
		public double CalcularXp() {
			// TODO Auto-generated method stub
			return 0;
		}
		
}
