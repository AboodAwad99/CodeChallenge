package testCases;

import Model.ReviewModel;
import base.JsonPathHandler;
import base.RequestHandler;
import com.google.gson.Gson;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import objectRepository.CurrencyListAPI;
import objectRepository.ReviewAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class ValidateSeeraAPIs {
    Gson gson = new Gson();
    @Test(priority = 0)
    public void verifyCurrencyAPI() {
        RequestHandler requestHandler = new RequestHandler();
        Response response= requestHandler.sendGetRequest(CurrencyListAPI.apiEndpoint,CurrencyListAPI.headers);
        assertEquals(response.statusCode(),200,"API status code mismatch");

        // Verify the base currency details
        assertTrue(JsonPathHandler.getMapByJsonPath(response,"base").containsKey("code"), "Base code does not exist");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"base.code"), "USD", "Incorrect base code");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"base.name"), "US Dollar", "Incorrect base name");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"base.symbol"),"$", "Incorrect base symbol");

        // Verify equivalent currencies
        assertFalse(JsonPathHandler.getListJsonPath(response, "equivalent").isEmpty(), "Equivalent currencies array is empty");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"equivalent[0].code"), "SAR", "Incorrect equivalent code");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"equivalent[0].name"), "Saudi Riyal", "Incorrect equivalent name");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"equivalent[0].symbol"), "SAR", "Incorrect equivalent symbol");
        assertEquals(JsonPathHandler.getDoubleValueByJsonPath(response,"equivalent[0].rate"), 3.750046, "Incorrect equivalent rate (or within a reasonable tolerance)");
    }
    @Test(priority = 1)
    public void verifyReviewAPI() {
        RequestHandler requestHandler = new RequestHandler();
        ReviewModel reviewModel = new ReviewModel();
        String productId = "1888776";
        reviewModel.setProductId(productId);
        reviewModel.setSortBy("Newest");
        Map<String, String> filters = new HashMap<>();
        filters.put("whotravelled2", "");
        reviewModel.setNextPageUrl("");
        reviewModel.setFilters(filters);

        Response response= requestHandler.sendPostRequest(ReviewAPI.apiEndpoint,ReviewAPI.headers,gson.toJson(reviewModel));
        assertEquals(response.statusCode(),200,"API status code mismatch");

        assertEquals(JsonPathHandler.getValueByJsonPath(response,"productId"), productId, "Product ID mismatch");

        int totalPages = JsonPathHandler.getIntValueByJsonPath(response,"paging.totalPages");
        int pageSize = JsonPathHandler.getIntValueByJsonPath(response,"paging.pageSize");
        int currentPageNumber = JsonPathHandler.getIntValueByJsonPath(response,"paging.currentPageNumber");

        if(currentPageNumber <totalPages){
            assertFalse(JsonPathHandler.getValueByJsonPath(response,"paging.nextPageUrl").isEmpty(), "NextPageUrl is missing in the response");
        }

        assertEquals(JsonPathHandler.getListJsonPath(response, "reviews").size(), pageSize,"Page size mismatch");

    }
    @Test(priority = 2)
    public void verifyReviewAPIInvalidScenario() {
        RequestHandler requestHandler = new RequestHandler();
        ReviewModel reviewModel = new ReviewModel();

        String productId = "test"; // Incorrect id
        reviewModel.setProductId(productId);
        reviewModel.setSortBy("Newest");
        Map<String, String> filters = new HashMap<>();
        filters.put("whotravelled2", "");
        reviewModel.setNextPageUrl("");
        reviewModel.setFilters(filters);

        Response response= requestHandler.sendPostRequest(ReviewAPI.apiEndpoint,ReviewAPI.headers,gson.toJson(reviewModel));
        assertEquals(response.statusCode(),200,"API status code mismatch");
        assertEquals(JsonPathHandler.getValueByJsonPath(response,"productId"), productId, "Product ID mismatch");
        assertEquals(JsonPathHandler.getListJsonPath(response, "reviews").size(), 0,"Page size mismatch");

    }
}
