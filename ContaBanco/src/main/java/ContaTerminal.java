/**
 * <h1>ContaTerminal</h1>
 * Cria uma conta em um banco fictício com os dados informados pelo cliente
 *
 * @author Bernardo Carvalho
 * @version 1.0
 * @since 06/06/2024
 */

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // Instanciando a classe Scanner e criando um novo objeto
        Scanner scanner = new Scanner(System.in);

        // Registrando o número da conta do usuário
        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();

        // IMPORTANTE: "capturar" a quebra de linha (ENTER) do usuário
        scanner.nextLine();

        // Registrando o número da agência do usuário
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        // Registrando o nome do usuário
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        // Registrando o saldo da conta do usuário
        System.out.println("Por favor, digite o seu saldo:");
        float saldo = scanner.nextFloat();

        // Informando o usuário que a criação da conta foi um sucesso
        System.out.println("Olá " + nome
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo
                + " já está disponível para saque");
    }
}
