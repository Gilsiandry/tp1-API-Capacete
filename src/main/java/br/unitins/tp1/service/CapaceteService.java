package br.unitins.tp1.service;

import java.util.List;

import br.unitins.tp1.dto.CapaceteDTO;
import br.unitins.tp1.dto.CapaceteResponseDTO;

public interface CapaceteService {

    CapaceteResponseDTO create(CapaceteDTO capacete);
    void update(long id, CapaceteDTO capacete);
    void delete(long id);
    CapaceteResponseDTO findById(long id);
    List<CapaceteResponseDTO> findAll();
    
}