package sagsa.data;

import java.util.HashMap;
import java.util.Map;

public class FakeExcelRepository implements RepositoryContrato {
    private Map<String, String> baseDeDadosSimulada = new HashMap<>();

    public FakeExcelRepository() {
        // Simulando dados extraídos do documento "CAPACIDADES POR UC.xlsx"
        baseDeDadosSimulada.put("UC1-01", "Desenvolver algoritmos utilizando estruturas de controle e repetição.");
        baseDeDadosSimulada.put("UC3-02", "Mapear os subsistemas de uma aplicação com base nos requisitos.");
    }

    @Override
    public String buscarCapacidadePorCodigo(String codigo) {
        return baseDeDadosSimulada.getOrDefault(codigo, "Capacidade não encontrada na matriz curricular do SENAI.");
    }
}