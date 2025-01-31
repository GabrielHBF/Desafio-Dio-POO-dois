package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

		private String nome;
		private String Descricao;
		
		private final LocalDate dataInicial = LocalDate.now();
		private final LocalDate dataFinal = dataInicial.plusDays(45);
		private Set<Dev> devsIscritos = new HashSet<>();
		private Set<Conteudo> conteudos = new LinkedHashSet<>();
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getDescricao() {
			return Descricao;
		}
		
		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
		
		public Set<Dev> getDevsIscritos() {
			return devsIscritos;
		}
		
		public void setDevsIscritos(Set<Dev> devsIscritos) {
			this.devsIscritos = devsIscritos;
		}
		
		public Set<Conteudo> getConteudos() {
			return conteudos;
		}
		
		public void setConteudos(Set<Conteudo> conteudos) {
			this.conteudos = conteudos;
		}
		
		public LocalDate getDataInicial() {
			return dataInicial;
		}
		
		public LocalDate getDataFinal() {
			return dataFinal;
		}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(Descricao, conteudos, dataFinal, dataInicial, devsIscritos, nome);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bootcamp other = (Bootcamp) obj;
			return Objects.equals(Descricao, other.Descricao) && Objects.equals(conteudos, other.conteudos)
					&& Objects.equals(dataFinal, other.dataFinal) && Objects.equals(dataInicial, other.dataInicial)
					&& Objects.equals(devsIscritos, other.devsIscritos) && Objects.equals(nome, other.nome);
		}
		
		
		
}
