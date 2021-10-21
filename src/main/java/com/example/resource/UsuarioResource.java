package com.example.resource;

import com.example.model.Usuario;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuarioResource {

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(final Usuario usuario) {
        Usuario.persist(usuario);
    }
}
