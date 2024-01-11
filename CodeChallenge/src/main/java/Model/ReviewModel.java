package Model;
import java.util.Map;

public class ReviewModel {
    private String productId;
    private String sortBy;
    private Map<String, String> filters;
    private String nextPageUrl;

    public ReviewModel(String productId, String sortBy, Map<String, String> filters, String nextPageUrl) {
        this.productId = productId;
        this.sortBy = sortBy;
        this.filters = filters;
        this.nextPageUrl = nextPageUrl;
    }

    public ReviewModel() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Map<String, String> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, String> filters) {
        this.filters = filters;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }
}
