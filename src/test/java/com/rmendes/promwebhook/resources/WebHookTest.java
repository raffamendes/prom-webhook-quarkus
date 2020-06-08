package com.rmendes.promwebhook.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class WebHookTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/alerts")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}