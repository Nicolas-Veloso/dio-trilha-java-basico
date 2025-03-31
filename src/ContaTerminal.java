import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scan.nextInt();
        System.out.println("Informe o nome da agência: ");
        String nomeAgencia = scan.next();
        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scan.next();;
        System.out.println("Informe o saldo da conta: ");
        double saldo = scan.nextDouble();
        System.out.println("Olá," +nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é, " +nomeAgencia+ " conta " +numeroAgencia+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}