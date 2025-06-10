import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        String agencia;
        int numero;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Digite o seu nome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta!");
        numero = scanner.nextInt();

        System.out.println("Por fim, digite o valor a ser depositado!");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}