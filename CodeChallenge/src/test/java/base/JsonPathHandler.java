package base;

import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonPathHandler {
    public static String getValueByJsonPath(Response res,String path) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getString(path);
    }
    public static boolean getBooleanValueByJsonPath(Response res,String path) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getBoolean(path);
    }
    public static double getDoubleValueByJsonPath(Response res,String path) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getDouble(path);
    }
    public static int getIntValueByJsonPath(Response res,String path) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getInt(path);
    }

    public static <T> List<T> getListObjectsByJsonPath(Response res, String path, Class<T> objectType) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getList(path, objectType);
    }
    public static Map getMapByJsonPath(Response res, String path) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getMap(path);
    }
    public static  List getListJsonPath(Response res, String path) {
        JsonPath jsonPath = res.jsonPath();
        return jsonPath.getList(path);
    }
}
