package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Programação orientada a objetos - projeto sem orientação
		//Fazer um programa que ler as medidas dos lados de dois triangulos X e Y. Em seguida, mostrar o valor das áreas dos dois triang. e dizer qual dos tem + area.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite as dimensões do triângulo X:  ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Digite as dimensões do triângulo Y:  ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangulo X área: %.4f%n", areaX);
		System.out.printf("Triangulo Y área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior: X" );
		}
		else {
			System.out.println("Maior: Y" );
		}
		
		
		
		sc.close();

	}

}
