package br.unitins.tp1.service;

import java.util.List;

import br.unitins.tp1.dto.CategoriaDTO;
import br.unitins.tp1.dto.CategoriaResponseDTO;
import br.unitins.tp1.model.Categoria;
import br.unitins.tp1.repository.CategoriaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CategoriaServiceImpl implements CategoriaService {

    @Inject
    CategoriaRepository categoriaRepository;

    @Override
    @Transactional
    public CategoriaResponseDTO create(CategoriaDTO categoria) {
        Categoria novaCategoria = new Categoria();
        novaCategoria.setNome(categoria.nome());

        // realizando inclusao
        categoriaRepository.persist(novaCategoria);

        return CategoriaResponseDTO.valueOf(novaCategoria);
    }

    @Override
    @Transactional
    public void update(long id, CategoriaDTO categoria) {
        Categoria edicaoCategoria = categoriaRepository.findById(id);

        edicaoCategoria.setNome(categoria.nome());
        
    }

    @Override
    @Transactional
    public void delete(long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public CategoriaResponseDTO findById(long id) {
        return CategoriaResponseDTO.valueOf(categoriaRepository.findById(id));
    }

    @Override
    public List<CategoriaResponseDTO> findAll() {
        return categoriaRepository.findAll().stream().map(e -> CategoriaResponseDTO.valueOf(e)).toList();
    }
    
}