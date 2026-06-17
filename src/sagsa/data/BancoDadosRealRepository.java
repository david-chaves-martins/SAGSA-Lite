package sagsa.data;

import java.util.HashMap;
import java.util.Map;

public class BancoDadosRealRepository implements RepositoryContrato {
    private Map<String, String> tabelaCapacidades = new HashMap<>();

    public BancoDadosRealRepository() {
        // Simulando consulta em uma base de dados SQL hospedada na nuvem
        tabelaCapacidades.put("UC1-01", "Desenvolver algoritmos utilizando estruturas de controle e repeticao.");
        tabelaCapacidades.put("UC3-02", "Mapear os subsistemas de uma aplicacao com base nos requisitos.");
        tabelaCapacidades.put("UC3-03", "Aplicar principios de arquitetura de software em sistemas modulares.");
    }

    @Override
    public String buscarCapacidadePorCodigo(String codigo) {
        return tabelaCapacidades.getOrDefault(
                codigo,
                "Capacidade nao encontrada na base SQL em nuvem."
        );
    }
}
