package br.com.aula8.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aula8.beans.Aluno;

public class ExecutarCollection {

	public static void main(String[] args) {

		List<String> listaNome = new ArrayList<String>();

		listaNome.add("Mariana");
		listaNome.add("Juliana");
		listaNome.add("Catia");
		listaNome.add("Ana");
		listaNome.add("Tatiana");

		System.out.println("Tamanho dinâmico: " + listaNome.size());

		System.out.println("Mostrar posição [2]: " + listaNome.get(2));

		System.out.println("Lista Original:" + listaNome);
		Collections.sort(listaNome);
		System.out.println("Lista Organizada:" + listaNome);

		// Pesquisar Vetor
		String pesquisa = JOptionPane.showInputDialog("Digite o nome para pesquisa:");

		int i = listaNome.indexOf(pesquisa);

		if (i >= 0) {
			System.out.println("Encontrado na posição: " + i + " - " + listaNome.get(i));
		} else {
			System.out.println("Não encontrado...");
		}

		// Agora é com Classe

		System.out.println(" --Agora é com a Classe :-) ");

		List<Aluno> listaAluno = new ArrayList<Aluno>();

		Aluno a1 = new Aluno("Mike", 9, 2, 20);
		Aluno a2 = new Aluno("Alan", 10, 3, 34);
		Aluno a3 = new Aluno("Jorge", 8, 7, 40);
		Aluno a4 = new Aluno("Breno", 6, 1, 18);

		listaAluno.add(a1);
		listaAluno.add(a2);
		listaAluno.add(a3);
		listaAluno.add(a4);

		System.out.println("Tamanho dinâmico: " + listaAluno.size());

		System.out.println("Mostrar posição [2]: " + listaAluno.get(2).getNome());

		System.out.println("Lista Original: " + listaAluno);

		for (Aluno elAluno : listaAluno) {
			System.out.println(elAluno.getNome() + " idade:" + elAluno.getIdade());
		}

		Collections.sort(listaAluno);

		System.out.println("Lista por idade: " + listaAluno);

		for (Aluno elAluno : listaAluno) {
			System.out.println(elAluno.getNome() + " idade:" + elAluno.getIdade());
		}

	}

}
