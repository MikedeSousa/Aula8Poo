package br.com.aula8.implementacao;

import javax.swing.JOptionPane;

import br.com.aula8.beans.Aluno;

public class ExecutarVetor {

	public static void main(String[] args) {

		String listaNome[] = { "Ana", "Beatriz", "Maria" };

		// Apresentar a lista.

		System.out.println(listaNome[2]);

		for (int posicao = 0; posicao < 3; posicao++) {
			System.out.println("Indice: [" + posicao + "]" + listaNome[posicao]);

		}

		String pesquisa = JOptionPane.showInputDialog("Digite o nome para pesquisa:");

		for (int i = 0; i < 3; i++) {
			if (listaNome[i].equalsIgnoreCase(pesquisa)) {
				System.out.println("Achou a posicao: " + i);
			}
		}

		// Vetor simples de Objetos

		Aluno[] listaAlunos = new Aluno[5];

		listaAlunos[0] = new Aluno("Mike", 9, 2, 20);
		listaAlunos[1] = new Aluno("Alan", 10, 3, 34);
		listaAlunos[2] = new Aluno("Jorge", 8, 7, 40);
		listaAlunos[3] = new Aluno("Breno", 6, 1, 18);
		listaAlunos[4] = new Aluno("Renato", 6, 0, 31);

		System.out.println("Lista de Alunos: " + listaAlunos[2].getNome());

		listaAlunos[2].setMedia(30);
		listaAlunos[2].setFaltas(100);

		System.out.println("Faltas do Aluno: " + listaAlunos[2].getFaltas());

		pesquisa = JOptionPane.showInputDialog("Digite o nome do Aluno para pesquisa:");

		for (int i = 0; i < 5; i++) {
			if (listaAlunos[i].getNome().equalsIgnoreCase(pesquisa)) {
				System.out.println("Achou a posicao: " + i);
			}
		}

	}
}
