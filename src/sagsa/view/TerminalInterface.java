package sagsa.view;

import java.util.Scanner;
import sagsa.core.GeradorEstrategiaCore;

public class TerminalInterface {
    private GeradorEstrategiaCore coreEngine;

    public TerminalInterface(GeradorEstrategiaCore core) {
        this.coreEngine = core;
    }

    public void renderizarJanelaTerminal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== BEM-VINDO AO SAGSA LITE (Turma APTEC132T26) ======");
        System.out.print("Digite o código da Capacidade (Ex: UC3-02): ");
        String codigoInput = scanner.nextLine();

        // Solicita processamento isolado ao subsistema core
        String resultadoFinal = coreEngine.processarEstrategiaDocente(codigoInput);
        System.out.println("\n" + resultadoFinal);
        scanner.close();
    }
}