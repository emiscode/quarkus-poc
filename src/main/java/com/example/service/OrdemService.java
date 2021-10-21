package com.example.service;

import com.example.model.Ordem;
import com.example.model.Usuario;
import com.example.repository.OrdemRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.SecurityContext;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class OrdemService {
    @Inject
    OrdemRepository ordemRepository;

    public List<Ordem> listar() {
        return this.ordemRepository.listAll();
    }

    public void inserir(final SecurityContext securityContext, final Ordem ordem) {
        final Optional<Usuario> usuarioOptional = Usuario.findByIdOptional(ordem.getUserId());
        final Usuario usuario = usuarioOptional.orElseThrow();

        if (!usuario.getUsername().equals(securityContext.getUserPrincipal().getName())) {
            throw new RuntimeException(("userId must be the same as the logged user"));
        }

        ordem.setData(LocalDate.now());
        ordem.setStatus(("Enviada"));

        this.ordemRepository.persist(ordem);
    }
}
