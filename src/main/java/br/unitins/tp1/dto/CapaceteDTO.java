package br.unitins.tp1.dto;

import br.unitins.tp1.enums.Classificacao;

public record CapaceteDTO(
    String marca,
    String categoria,
    Long tamanho,
    Classificacao classificacao
    ){

}