import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Usuario usuario = new Usuario();

        System.out.println("-------------------BANCO BD-----------------");

        System.out.println("-Seja bem-vindo ao banco BD\nPor favor digite o número da agência: ");
        usuario.agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Usuário:"+usuario.numeroConta+" (depois ENTER)");
        scanner.nextLine();

        System.out.println("\nDigite seu nome");
        usuario.nome = scanner.nextLine();

        System.out.println("\nDigite o valor a ser depositado de início:");
        usuario.saldo = scanner.nextDouble();

        System.out.println("\n-------------------------------------------");
        System.out.println("Olá, senhor(a) " + usuario.nome + 
                           ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência: " + usuario.agencia);
        System.out.println("Conta: " + usuario.numeroConta);
        System.out.println("Saldo disponível para saque: R$" + usuario.saldo);
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}
