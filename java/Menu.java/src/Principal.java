package br.com.heiderlopes;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Benvindo de novo " + nome);
		
	}

}
