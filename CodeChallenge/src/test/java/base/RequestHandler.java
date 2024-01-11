package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

public class RequestHandler {
    public Response sendPostRequest(String endpoint, Map<String, String> headers, Object requestBody) {
        return RestAssured.given()
                .log()
                .all()
                .headers(headers)
                .body(requestBody)
                .post(endpoint)
                .thenReturn();
    }
    public Response sendGetRequest(String endpoint, Map<String, String> headers) {
        return RestAssured.given()
                .headers(headers)
                .log()
                .all()
                .get(endpoint)
                .thenReturn();
    }
}
