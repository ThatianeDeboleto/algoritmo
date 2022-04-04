import java.util.Scanner;

public class sintaxe {

	public static void main(String[] args) {
		// funcoes sintaxe 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números:  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//logica encontrar o maior dentre os 3
		
		if(a > b && a < c) {
			System.out.println("Maior: " + a);
		}
		else if (b > c) {
			System.out.println("Maior: " + b);
		}
		else {
			System.out.println("Maior: " + c);
		}
		
		sc.close();

	}

}
