package org.example.test.api;

import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.with;
@Log4j2
public class createUserTest {
    Random random= new Random();
    final String TEST_USER_NAME = RandomStringUtils.randomAlphabetic(5);

    @Test
    public void createUserTest() {
        Response response = with().header("content-type","application/json").body(new ApiUser(5555, TEST_USER_NAME, "Bachkov", "", "", "", "", 1)).when().post("https://petstore.swagger.io/v2/user").then().assertThat().statusCode(200).extract().response();
        System.out.println("Test");
    }
}
