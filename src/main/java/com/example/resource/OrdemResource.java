package com.example.resource;

import com.example.model.Ordem;
import com.example.service.OrdemService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import java.util.List;

@Path("/ordens")
public class OrdemResource {

    @Inject
    OrdemService ordemService;

    @POST
    @Transactional
    @RolesAllowed("user")
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(@Context final SecurityContext securityContext, final Ordem ordem) {
        this.ordemService.inserir(securityContext, ordem);
    }

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ordem> listar() {
        return this.ordemService.listar();
    }

}
