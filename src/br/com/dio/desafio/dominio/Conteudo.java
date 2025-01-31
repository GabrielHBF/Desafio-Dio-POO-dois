package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_Padrao = 10.0;
	
	private String titulo;
	private String 	descricao;
	
	public abstract double CalcularXp();

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
}
