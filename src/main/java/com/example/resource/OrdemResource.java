package com.example.resource;

import com.example.model.Ordem;
import com.example.repository.OrdemRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;

@Path("/ordens")
public class OrdemResource {

    @Inject
    OrdemRepository ordemRepository;

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(final Ordem ordem) {
        ordem.setData(LocalDate.now());
        ordem.setStatus(("Enviada"));

        this.ordemRepository.persist(ordem);
    }
}
