package br.unitins.tp1.resource;

import java.util.List;

import br.unitins.tp1.dto.CapaceteDTO;
import br.unitins.tp1.dto.CapaceteResponseDTO;
import br.unitins.tp1.service.CapaceteService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("capacetes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CapaceteResource {

    @Inject
    CapaceteService service;

    @GET
    public List<CapaceteResponseDTO> buscarTodos() { 
        return service.findAll();
    }

    @POST
    public CapaceteResponseDTO incluir(CapaceteDTO dto) {
        return service.create(dto);
    }

    @PUT
    @Path("/{id}")
    public void alterar(Long id, CapaceteDTO dto) {
        service.update(id, dto);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void apagar(Long id) {
        service.delete(id);
    }

}