package org.example.test.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;

public class PetTest {

    @Test
    public void apiPetTest() {
        when().get("https://petstore.swagger.io/v2/pet/61502").then().assertThat().statusCode(200).and().body("category.name", is("Labrador"));

    }
    @Test
    public void addPet(){

    }
}
