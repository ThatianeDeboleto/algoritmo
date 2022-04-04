import java.io.IOException;
import java.util.Scanner;

public class Menu
{
    public static void main()
    {
        cabecalho("Login");
        menuInicial();
    }
    
    public static void cabecalho(String sMenu)
    {
        try
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpando a linha 
            System.out.println("=============================");
            System.out.println("=========== " + sMenu + " ===========");
            System.out.println("=============================");
        } 
        catch (Exception e)
        {
            System.out.println("Erro");
        }
    }
    
    public static void menuPrincipal(int iId)
    {
        String sOption;
    
        do
        {
            cabecalho("Menu");
            System.out.println(iId);
            System.out.println("A) Acessar Viagens");
            System.out.println("B) Criar Viagens");
            System.out.println("C) Atualizar Dados");
            System.out.println("0) Sair");
            
            System.out.println("Op��o: ");
            Scanner oOpcao = new Scanner(System.in);
            sOption = oOpcao.nextLine();
        } while (!sOption.equals("A") && !sOption.equals("B") && !sOption.equals("C") && !sOption.equals("0"));
        
        if (sOption.equals("A"))
        {
            menuViagem(iId);
        }
        else if (sOption.equals("B"))
        {
            menuCriarViagem(iId);
        }
        else if (sOption.equals("C"))
        {
            menuAtualizarDados(iId);
        }
        else if (sOption.equals("0"))
        {
            System.exit(0);
        }
    }
    
    public static void menuViagem(int iId) 
    {
        cabecalho("Viagens");
        Viagem oViagem = new Viagem();
        oViagem.listarViagens(iId);
    }
    
    public static void menuCriarViagem(int iId) 
    {
        cabecalho("Criar Viagem");
        Viagem oViagem = new Viagem();
        oViagem.criarViagem(iId);
    }
    
    public static void menuAtualizarDados(int iId) 
    {
        cabecalho("Atualizar Dados");
        Usuario oUsuario = new Usuario();
        oUsuario.atualizarDados(iId);
    }
    
    public static void menuInicial()
    {
        String sOption;
        cabecalho("Iniciar");
        System.out.println("A) Login");
        System.out.println("B) Criar Usu�rio");
        System.out.println("0) Sair");
        
        System.out.println("Op��o: ");
        Scanner oOpcao = new Scanner(System.in);
        sOption = oOpcao.nextLine();
        
        if (sOption.equals("A"))
        {
            Usuario oUsuario = new Usuario();
            oUsuario.loginAction();
        }
        else if (sOption.equals("B"))
        {
            Usuario oUsuario = new Usuario();
            oUsuario.criarUsuario();
        }
        else if (sOption.equals("0"))
        {
            System.exit(0);
        }
    }
}