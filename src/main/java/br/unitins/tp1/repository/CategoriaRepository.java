package br.unitins.tp1.repository;

import br.unitins.tp1.model.Categoria;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriaRepository implements PanacheRepository<Categoria> {

    public Categoria findBySigla(String nome) {
        return find("SELECT e FROM Categoria e WHERE e.nome = ?1 ", nome).firstResult();
    }

}