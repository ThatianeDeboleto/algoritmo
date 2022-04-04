package br.com.heiderlopes;

import java.util.Scanner;

public class Menu {
	
	public final static int CADASTRO_PRODUTO 	= 1;
	public final static int EMISSAO_NOTA 		= 2;
	public final static int CANCELAR_COMPRA 		= 3;
	public final static int EFETUAR_VENDA 		= 4;

	public static void menu(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu Principal");
		System.out.println("1 - Cadastro de Produtos");
		System.out.println("2 - Emitir Nota Fiscal");
		System.out.println("3 - Cancelar Compra");
		System.out.println("4 - Efetuar Venda");

		System.out.println("Digite a opcao desejada: ");

		int opcao = entrada.nextInt();

		switch (opcao) {
		case CADASTRO_PRODUTO:
			System.out.println("Cadastro de Produtos");
			break;
		case EMISSAO_NOTA:
			System.out.println("Emitir Nota Fiscal");
			break;
		case CANCELAR_COMPRA:
			System.out.println("Cancelar Compra");
			break;
		case EFETUAR_VENDA:
			System.out.println("Efetuar Venda");
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}

}
