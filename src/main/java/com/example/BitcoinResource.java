package com.example;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bitcoins")
public class BitcoinResource {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BitcoinModel> list() {
        return bitcoinService.list();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/data")
    public String data() {

        return "[{\"data\":\"2020-09-15\",\"id\":1,\"preco\":58.55,\"tipo\":\"VENDA\"}," +
                "{\"data\":\"2020-09-15\",\"id\":2,\"preco\":58.55,\"tipo\":\"VENDA\"}," +
                "{\"data\":\"2020-09-15\",\"id\":3,\"preco\":58,\"tipo\":\"COMPRA\"}," +
                "{\"data\":\"2020-09-15\",\"id\":4,\"preco\":58.99,\"tipo\":\"COMPRA\"}," +
                "{\"data\":\"2020-09-15\",\"id\":5,\"preco\":58,\"tipo\":\"COMPRA\"}]";
    }
}
