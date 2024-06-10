/**
 * <h1>AparelhoTelefonico</h1>
 * Simula o comportamento do aparelho telefônico de um iPhone
 *
 * @author Bernardo Carvalho
 * @version 1.0
 * @since 10/06/2024
 */

package software;

public class AparelhoTelefonico {

    // Liga para determinado número
    public static void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    // Atende o telefone
    public static void atender() {
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    // Inicia o correio de voz
    public static void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
