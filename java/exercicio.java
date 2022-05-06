import java.util.Scanner;

public class exercicio {

    //Lendo e imprimindo textos e números
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1) pedir pro usuário informar:
            //1) Nome
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
            //2) Idade
            System.out.println("Informe a sua idade: ");
            int idade = in.nextInt();
            //3) Curso
            System.out.println("Informe o seu curso: ");
            String curso = in.next();
          //4) Genero
            System.out.println("Informe o seu genero: ");
            String genero = in.next();
          //5) Peso
            System.out.println("Informe o seu peso: ");
            String peso = in.next();

        // 2) armazenar as informações do usuário em variáveis
        // 3) alterar a frase do enunciado
        // Ola. Meu nome é <nome>, sou natural de <cidade>,
        //  tenho <idade> anos, e estou aprendendo a programar.
            System.out.print("Ola. Meu nome é "+nome);
            System.out.print(", curso "+curso);
            System.out.print(", do genero "+genero);
            System.out.print(", peso "+peso);
            System.out.print(" anos, e estou aprendendo a programar.");
    }
}
