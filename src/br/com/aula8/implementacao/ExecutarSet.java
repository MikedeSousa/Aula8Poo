package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSet {

	public static void main(String[] args) {

		Set<String> coresSet = new HashSet<String>();

		coresSet.add("Azul");
		coresSet.add("Marrom");
		coresSet.add("Verde");
		coresSet.add("Branco");
		coresSet.add("Preto");

		coresSet.add("Verde"); // Esse não aparece em duplicidade na tela, o HashSet não deixa.

		// Listar os objetos, porém não organiza em ordem.
		System.out.println(coresSet);

		for (String elcoresSet : coresSet) {
			System.out.println(elcoresSet);
		}

		// Procurar um elemento usando o HashSet
		System.out.println("Existe a cor Verde? " + coresSet.contains("Verde"));
		System.out.println("Existe a cor Amarela? " + coresSet.contains("Amarela"));

		// Remover um elemento usando o HashSet
		coresSet.remove("Rosa");
		coresSet.remove("Verde");

		// Listar
		System.out.println(coresSet);

	}

}
