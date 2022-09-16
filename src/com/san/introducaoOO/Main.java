package com.san.introducaoOO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.san.introducaoOO.entidade.Pessoa;

public class Main {

	private static final int QUANTIDADE_PESSOA = 10;

	public static void main(String[] args) {
		
		Pessoa listaPessoas[] = new Pessoa[QUANTIDADE_PESSOA];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < QUANTIDADE_PESSOA; i++) {

			System.out.println("Pessoa #0" + (i + 1));

			System.out.print("Nome: ");
			String nome = input.next();

			System.out.print("Idade: ");
			int idade = input.nextInt();

			System.out.println();

			listaPessoas[i] = new Pessoa(nome, idade);

		}

		Pessoa[] listaOrdenada = orderByNome(listaPessoas);

		System.out.println("Lista ordernada por NOME:");

		for (Pessoa pessoa : listaOrdenada) {
			System.out.println(pessoa);
		}

		System.out.println("\nLista ordenada por IDADE:");

		orderByIdade(listaPessoas);

		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}

	}

	// test whit an comparator
	private static Comparator<Pessoa> comparadorPessoa() {
		return new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return p1.getNome().compareTo(p2.getNome());
			}

		};
	}

	private static Pessoa[] orderByNome(Pessoa[] listaPessoas) {

		Pessoa[] result = new Pessoa[listaPessoas.length];
		String names[] = new String[listaPessoas.length];

		for (int i = 0; i < listaPessoas.length; i++) {
			names[i] = listaPessoas[i].getNome();
		}

		Arrays.sort(names);

		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names.length; j++) {
				if (names[i].equals(listaPessoas[j].getNome())) {
					result[i] = listaPessoas[j];
				}
			}

		}

		return result;
	}

	private static void orderByIdade(Pessoa[] listaPessoa) {

		boolean troquei = true;

		while (troquei) {

			troquei = false;

			for (int i = 0; i < listaPessoa.length; i++) {

				if (i == (listaPessoa.length - 1)) {
					continue;
				}

				if (listaPessoa[i].getIdade() > listaPessoa[i + 1].getIdade()) {
					Pessoa pessoaTemp = listaPessoa[i];
					listaPessoa[i] = listaPessoa[i + 1];
					listaPessoa[i + 1] = pessoaTemp;

					troquei = true;
				}
			}

		}

	}

}
