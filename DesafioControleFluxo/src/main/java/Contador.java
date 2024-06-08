/**
 * <h1>Contador</h1>
 * Imprime no terminal 'n' números baseado nos valores inseridos pelo usuário
 *
 * @author Bernardo Carvalho
 * @version 1.0
 * @since 08/06/2024
 */

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        // Instanciando a classe Scanner e criando um novo objeto
        Scanner terminal = new Scanner(System.in);

        // Registrando o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Registrando o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // Assegurar a captura de uma possível exceção
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // Lança uma exceção caso o paramêtro dois seja maior que o primeiro
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Calcula o número de iterações
        int contagem = parametroDois - parametroUm;

        // Imprime no terminal os números
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
