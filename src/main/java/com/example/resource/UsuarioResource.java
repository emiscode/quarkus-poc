package com.example.resource;

import com.example.model.Usuario;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
public class UsuarioResource {

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public static List<Usuario> listar() {
        return Usuario.listAll();
    }

    @POST
    @PermitAll
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(final Usuario usuario) {
        Usuario.preparar(usuario);
        Usuario.persist(usuario);
    }
}
