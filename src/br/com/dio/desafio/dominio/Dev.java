package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

		private String nome;
		private Set<Conteudo> contedudoEscrito = new LinkedHashSet<>();
		private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
		
		public void inscreverBootcamp(Bootcamp b) {
			this.contedudoEscrito.addAll(b.getConteudos());
			b.getDevsIscritos().add(this);
		};
		
		public void progredir() {
			Optional<Conteudo> conteudo = this.contedudoEscrito.stream().findFirst();
			if(conteudo.isPresent()) {
				this.conteudosConcluidos.add(conteudo.get());
				this.contedudoEscrito.remove(conteudo.get());
			}else {
				System.err.println("Voçê nao está escrtito nesse curso");
			}
			
		};
		
		public double calcularXp() {
			return this.conteudosConcluidos.
					stream().
					mapToDouble(Conteudo :: CalcularXp).
					sum();
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Set<Conteudo> getContedudoEscrito() {
			return contedudoEscrito;
		}

		public void setContedudoEscrito(Set<Conteudo> contedudoEscrito) {
			this.contedudoEscrito = contedudoEscrito;
		}

		public Set<Conteudo> getConteudosConcluidos() {
			return conteudosConcluidos;
		}

		public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
			this.conteudosConcluidos = conteudosConcluidos;
		};
		
		
		@Override
		public int hashCode() {
			return Objects.hash(contedudoEscrito, conteudosConcluidos, nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Dev other = (Dev) obj;
			return Objects.equals(contedudoEscrito, other.contedudoEscrito)
					&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
					&& Objects.equals(nome, other.nome);
		}
}
