package br.unitins.tp1.dto;

import br.unitins.tp1.model.Categoria;


public record CategoriaResponseDTO(
    Long id,
    String nome) {

    public static CategoriaResponseDTO valueOf(Categoria categoria) {
        if (categoria == null)
            return null;
        return new CategoriaResponseDTO(categoria.getId(), categoria.getNome());
    }
    
}