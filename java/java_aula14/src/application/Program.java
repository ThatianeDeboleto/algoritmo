package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Programa��o orientada a objetos - projeto sem orienta��o
		//Fazer um programa que ler as medidas dos lados de dois triangulos X e Y. Em seguida, mostrar o valor das �reas dos dois triang. e dizer qual dos tem + area.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite as dimens�es do tri�ngulo X:  ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Digite as dimens�es do tri�ngulo Y:  ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangulo X �rea: %.4f%n", areaX);
		System.out.printf("Triangulo Y �rea: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior: X" );
		}
		else {
			System.out.println("Maior: Y" );
		}
		
		
		
		sc.close();

	}

}
