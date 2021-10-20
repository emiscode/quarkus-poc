package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class BitcoinResourceTest {

    @Test
    public void testBitcoinEndpoint() {
        given()
                .when().get("/bitcoins")
                .then()
                .statusCode(200);
    }

}