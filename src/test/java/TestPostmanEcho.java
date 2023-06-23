import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostmanEcho {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",equalTo("Hello"))
        ;
    }
}