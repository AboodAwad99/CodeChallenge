package objectRepository;
import java.util.HashMap;
import java.util.Map;
public class CurrencyListAPI {
    public static String apiEndpoint = "https://global.almosafer.com/api/system/currency/list";

    public static Map<String, String> headers = new HashMap<>();
    static {
        headers.put("sec-ch-ua", "\"Not_A Brand\";v=\"8\", \"Chromium\";v=\"120\", \"Google Chrome\";v=\"120\"");
        headers.put("x-locale", "en");
        headers.put("x-tz", "Asia/Amman");
        headers.put("sec-ch-ua-mobile", "?0");
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        headers.put("Accept", "application/json, text/javascript");
        headers.put("x-currency", "USD");
        headers.put("x-bt", "next");
        headers.put("x-app-name", "ct-web-flights-desktop-almosafer");
        headers.put("Referer", "https://global.almosafer.com/en/flights/RUH-DXB/2024-01-11/2024-01-12/Economy/1Adult");
        headers.put("sec-ch-ua-platform", "\"macOS\"");
        headers.put("Cookie", "__cf_bm=Y2EhWUNV462OmWgqW23afrrJuRjSd.UC3_4LsEJ8UdE-1704859702-1-AfvtwTn9hUQpO2hcJ38CtVICtAnYCli0vc8uwIf4T8j+wafygX1OmG4ZxoCwpWAkr7YA9PgVcPT0lxYGyUi09hU=");
    }
}
