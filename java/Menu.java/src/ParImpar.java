package br.com.heiderlopes;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor: ");
		int valor = entrada.nextInt();
		
		if(valor % 2 == 0 ) {
			System.out.println("Valor eh par");
		} else {
			System.out.println("Valor eh impar");
		}
		
	}

}
