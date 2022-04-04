package br.com.heiderlopes;

import java.util.Scanner;

public class Chute {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroChute;
		int contadorChutes = 0;
		System.out.println("Informe o numero a ser adivinhado: ");
		int  numeroEscolhido = entrada.nextInt();
		do {
			System.out.println("Chute um numero: ");
			numeroChute = entrada.nextInt();
			contadorChutes++;
			
			if(numeroChute > numeroEscolhido) {
				System.out.println("Errrroooou... Seu chute foi alto");
			} else if(numeroChute < numeroEscolhido) {
				System.out.println("Errrroooou... Seu chute foi baixo");
			}
		} while(numeroChute != numeroEscolhido);
		System.out.println("Total de tentativas: " + contadorChutes);
	}
}