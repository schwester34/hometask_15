package tests;

import config.ApiConfig;
import io.restassured.http.ContentType;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    void apiTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        given()
                .contentType(ContentType.JSON)
                .get(config.baseUrl())
                .then().log().all()
                .statusCode(200);
    }
    System.out.println(token);
}
