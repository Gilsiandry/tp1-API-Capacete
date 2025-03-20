package br.unitins.tp1.service;

import java.util.List;

import br.unitins.tp1.dto.CategoriaDTO;
import br.unitins.tp1.dto.CategoriaResponseDTO;

public interface CategoriaService {

    CategoriaResponseDTO create(CategoriaDTO categoria);
    void update(long id, CategoriaDTO categoria);
    void delete(long id);
    CategoriaResponseDTO findById(long id);
    List<CategoriaResponseDTO> findAll();
    
}