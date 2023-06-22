package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import dto.PersonDTO;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import runner.RunCucumberTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertThat;

public class APIStarWars {
    private static Response response = null;
    public static final String URL_API_STAR_WARS = "https://swapi.dev/api";
    public static final String URL_REQRAS = "https://reqres.in/api";
    @Dado("^que fiz o GET na api de Star Wars$")
    public void faco_get() throws Throwable {
        response = get(URL_API_STAR_WARS + "/people/1/");
        System.out.println("Response: " + response.asString());
    }

    @Entao("^recebo um codigo (\\d+)$")
    public void valido_status_code(int codigo) {
        int statusCode = response.getStatusCode();
        assertEquals(codigo, statusCode);
        System.out.println("Status Code: " + response.getStatusCode());
    }
    @E("realizo as validacoes de nome (.*) e altura (\\d+)")
    public void realizar_validacoes(String nomeEsperado, int alturaEsperada) {
        String responseBody = response.getBody().asString();
        JsonPath jsonPath = new JsonPath(responseBody);
        // Verificar o nome;
        String nomeAtual = jsonPath.getString("name");
        assertEquals(nomeEsperado, nomeAtual);
        System.out.println(nomeAtual);
        // Verificar a altura
        int alturaAtual = jsonPath.getInt("height");
        assertEquals(alturaEsperada, alturaAtual);
    }

    @Dado("que fiz o POST na api de Star Wars com nome (.*), altura (\\d+) e peso (\\d+)")
    public void postDemo(String nome, Integer altura, Integer peso) {
        {
            PersonDTO people = new PersonDTO(nome, altura, peso);
            response = given()
                    .contentType(ContentType.JSON)
                        .body(people)
                    .when()
                        .post(URL_REQRAS+ "/people/1")
                    .then()
                        .extract()
                        .response();
            System.out.println("Response: " + response.asString());
            String expectedName = nome;
            String responseBody = response.getBody().asString();
            JsonPath jsonPath = new JsonPath(responseBody);
            String actualName = jsonPath.getString("name");
            Assert.assertEquals(expectedName, actualName);
        }
    }
}


