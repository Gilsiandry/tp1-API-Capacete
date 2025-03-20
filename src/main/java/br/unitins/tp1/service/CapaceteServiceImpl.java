package br.unitins.tp1.service;

import java.util.List;

import br.unitins.tp1.dto.CapaceteDTO;
import br.unitins.tp1.dto.CapaceteResponseDTO;
import br.unitins.tp1.enums.Classificacao;
import br.unitins.tp1.model.Capacete;
import br.unitins.tp1.repository.CapaceteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CapaceteServiceImpl implements CapaceteService {

    @Inject
    CapaceteRepository capaceteRepository;

    @Override
    @Transactional
    public CapaceteResponseDTO create(CapaceteDTO capacete) {
        Capacete novoCapacete = new Capacete();
        novoCapacete.setMarca(capacete.marca());
        novoCapacete.setCategoria(capacete.categoria());
        novoCapacete.setTamanho(capacete.tamanho());

        if(capacete.tamanho() < 56) {
            novoCapacete.setClassificacao(Classificacao.INFANTIL);    
        } else {
            novoCapacete.setClassificacao(Classificacao.ADULTO);
        }

        // realizando inclusao
        capaceteRepository.persist(novoCapacete);

        return CapaceteResponseDTO.valueOf(novoCapacete);
    }

    @Override
    @Transactional
    public void update(long id, CapaceteDTO capacete) {
        Capacete edicaoCapacete = capaceteRepository.findById(id);

        edicaoCapacete.setMarca(capacete.marca());
        edicaoCapacete.setCategoria(capacete.categoria());
        edicaoCapacete.setTamanho(capacete.tamanho());
        edicaoCapacete.setClassificacao(capacete.classificacao());
        
    }

    @Override
    @Transactional
    public void delete(long id) {
        capaceteRepository.deleteById(id);
    }

    @Override
    public CapaceteResponseDTO findById(long id) {
        return CapaceteResponseDTO.valueOf(capaceteRepository.findById(id));
    }

    @Override
    public List<CapaceteResponseDTO> findAll() {
        return capaceteRepository.findAll().stream().map(e -> CapaceteResponseDTO.valueOf(e)).toList();
    }
    
}