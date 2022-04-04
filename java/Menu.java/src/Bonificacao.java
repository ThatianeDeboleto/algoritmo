package br.com.heiderlopes;

import java.util.Locale;
import java.util.Scanner;

public class Bonificacao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o salario do funcionario: ");
		double salario = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite a área do funcionario: ");
		String area = entrada.nextLine();
		
		if(area.equals("TI")) {
			salario *= 1.1; 
		}
		
		System.out.println(nome + " seu salario eh de " + salario);
	}
}
