import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// funcoes sintaxe 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números:  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//logica encontrar o maior dentre os 3
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();

	}
//criar funcoes
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior: " + value);
	}

}