package com.example.repository;

import com.example.model.Ordem;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
public class OrdemRepositoryTest {
    @InjectMock
    OrdemRepository ordemRepository;

    @Test
    public void testListAll() {
        final Ordem ordemUm = new Ordem();
        final Ordem orderDois = new Ordem();

        final List<Ordem> ordens = new ArrayList<Ordem>();

        ordens.add(ordemUm);
        ordens.add(orderDois);

        Mockito.when(this.ordemRepository.listAll()).thenReturn(ordens);

        Assertions.assertSame(orderDois, this.ordemRepository.listAll().get(1));
    }

}
