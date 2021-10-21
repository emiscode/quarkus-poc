package com.example.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

@QuarkusTest
class UsuarioTest {

    @Test
    void testFindById() {
        PanacheMock.mock(Usuario.class);

        final Usuario usuario = new Usuario();
        final Optional<PanacheEntityBase> usuarioOptional = Optional.of(usuario);

        Mockito.when(Usuario.findByIdOptional(100)).thenReturn(usuarioOptional);

        Assertions.assertSame(usuario, Usuario.findByIdOptional(100).get());
    }
}
