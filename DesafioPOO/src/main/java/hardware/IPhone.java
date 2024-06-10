/**
 * <h1>IPhone</h1>
 * Simula o comportamento de um iPhone
 *
 * @author Bernardo Carvalho
 * @version 1.0
 * @since 10/06/2024
 */

package hardware;

import software.AparelhoTelefonico;
import software.NavegadorInternet;
import software.ReprodutorMusical;

public class IPhone {
    public static void main(String[] args) {

        // Controlar músicas
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        System.out.println();

        // Controlar funcões de telefone
        AparelhoTelefonico.atender();
        AparelhoTelefonico.ligar("+55 (53) 3222-2222");
        AparelhoTelefonico.iniciarCorreioVoz();
        System.out.println();

        // Navegar pela internet
        NavegadorInternet.exibirPagina("https://www.google.com/");
        NavegadorInternet.adicionarNovaAba();
        NavegadorInternet.atualizarPagina();
    }
}
