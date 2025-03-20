package br.unitins.tp1.dto;

import br.unitins.tp1.enums.Classificacao;
import br.unitins.tp1.model.Capacete;


public record CapaceteResponseDTO(
    Long id,
    String marca,
    String categoria,
    Long tamanho,
    Classificacao classificacao
    ) {

    public static CapaceteResponseDTO valueOf(Capacete capacete) {
        if (capacete == null)
            return null;
        return new CapaceteResponseDTO(
            capacete.getId(),
            capacete.getMarca(),
            capacete.getCategoria(),
            capacete.getTamanho(),
            capacete.getClassificacao()
        );
    }
    
}