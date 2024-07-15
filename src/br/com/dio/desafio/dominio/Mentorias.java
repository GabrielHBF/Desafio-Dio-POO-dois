package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {

	private String titulo;
	private String 	descricao;
	private LocalDate data;
	
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
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentorias [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	@Override
	public double CalcularXp() {
		// TODO Auto-generated method stub
		return 0;
	} 
	
}
