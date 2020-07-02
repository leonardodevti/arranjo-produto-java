package aplicacao;

import java.util.Scanner;

import entidade.ArranjoProduto;

/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto.*/

public class Programa {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Informe a quantidade de produtos: ");
		int n = ent.nextInt();

		ArranjoProduto[] arranjoProd = new ArranjoProduto[n];

		for (int i = 0; i < arranjoProd.length; i++) {
			ent.nextLine();
			System.out.println("Informe o nome do produto:");
			String nome = ent.nextLine();
			System.out.println("Informe o preço do produto:");
			double preco = ent.nextDouble();
			arranjoProd[i] = new ArranjoProduto(nome, preco);
		}

		System.out.println("\nLista de Produtos: ");
		for (int i = 0; i < arranjoProd.length; i++) {
			System.out.println(arranjoProd[i]);
		}

		ent.nextLine();

		double soma = 0.0;

		for (int i = 0; i < arranjoProd.length; i++) {
			soma += arranjoProd[i].getPreco();
		}

		double media = soma / arranjoProd.length;
		System.out.printf("O preço médio dos produtos é: R$%.2f", media);

		ent.close();
	}

}
