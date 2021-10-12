package br.com.ejrocha.automatedsoftwaretesting;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;

public class CepServiceTest {

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI = "https://viacep.com.br/ws";
    }

    @Test
    public void testCepSearchSucess(){

        String cep = "01001000";
        String logradouroEsperado = "Praça da Sé";

        String logradouro = given().get( cep + "/json/").then().assertThat().statusCode(HttpStatus.SC_OK).extract().path("logradouro");
        
        assertEquals(logradouro, logradouroEsperado);
    }

    @Test
    public void testCepSearchEmptyCep(){
        String cep = "";
        given().get( cep + "/json/").then().assertThat().statusCode(HttpStatus.SC_BAD_REQUEST);        
    }
    
}
