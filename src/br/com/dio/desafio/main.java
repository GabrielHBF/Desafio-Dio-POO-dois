package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorias;

public class main {

	public static void main(String[] args) {
		
		Cursos curso1 = new Cursos();
		curso1.setTitulo("cursoUM");
		curso1.setDescricao("descricao curos um");
		curso1.setCategoria(1);
		
		Mentorias mentoria1 = new Mentorias();
		mentoria1.setTitulo("mentoria um");
		mentoria1.setDescricao("descricao mentoria um");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("bootcamp um");
		bootcamp1.setDescricao("descrição bootcap um");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoria1);
		
		Dev gabriel = new Dev();
		Dev henrique = new Dev();
		
		System.out.println("gabriel inscrições: " + gabriel.getContedudoEscrito());
		System.out.println("henrique inscrições: " + henrique.getContedudoEscrito());
		
		gabriel.inscreverBootcamp(bootcamp1);
		henrique.inscreverBootcamp(bootcamp1);
		
		System.out.println("gabriel inscrições: " + gabriel.getContedudoEscrito());
		System.out.println("henrique inscrições: " + henrique.getContedudoEscrito());
		

	}

}
