package objectRepository;
import java.util.HashMap;
import java.util.Map;
public class ReviewAPI {
    public static String apiEndpoint = "https://global.almosafer.com/api/review/retrieve";

    public static Map<String, String> headers = new HashMap<>();
    static {
        headers.put("authority", "global.almosafer.com");
        headers.put("accept", "application/json, text/javascript");
        headers.put("accept-language", "en-US,en;q=0.9");
        headers.put("cache-control", "private, no-cache, no-store, must-revalidate");
        headers.put("content-type", "application/json");
        headers.put("cookie", "cf_clearance=9nJReFBncaKwuicESoClEX607bVimwC11V9rqdVyrS0-1704859517-0-2-2123ebcc.89fd627b.a8ca6b71-0.2.1704859517; delete_old_tkn=true; _gcl_au=1.1.186907969.1704859518; __gtm_referrer=https%3A%2F%2Fgithub.com%2Ftajawal%2Fcode-challenge%2Fblob%2Fmaster%2FQA_Backend.md; _fbp=fb.1.1704859518140.2092999499; _gid=GA1.2.1022425034.1704859518; moe_uuid=26592494-aaa5-46fc-9a62-ba37d1b39728; USER_DATA=%7B%22attributes%22%3A%5B%5D%2C%22subscribedToOldSdk%22%3Afalse%2C%22deviceUuid%22%3A%2226592494-aaa5-46fc-9a62-ba37d1b39728%22%2C%22deviceAdded%22%3Atrue%7D; QuantumMetricSessionID=ff13f3760a26ead2e1c2250bea610e97; QuantumMetricUserID=8870e625421cc78469048fbc91338958; SOFT_ASK_STATUS=%7B%22actualValue%22%3A%22not%20shown%22%2C%22MOE_DATA_TYPE%22%3A%22string%22%7D; userSelectedPos=GLOBAL; OPT_IN_SHOWN_TIME=1704859534517; HARD_ASK_STATUS=%7B%22actualValue%22%3A%22dismissed%22%2C%22MOE_DATA_TYPE%22%3A%22string%22%7D; language=en; currency=USD; ENIGMA_API_TOKEN=4R!eVj7$&7Q8Duhv1#pB; __cf_bm=fSFhfsVydoFuGHmmfCMxYDz_8qsB0YKxo7.7UuNOcIw-1704860160-1-ASiG07f79lEyPDJutMqAcPT8VT285Njp1T6JQz/WH+4BSzvp/jaiaw8s0o77W1SQcX1CvqToie+Q/iIujCE0aVA=; _gat=1; _dc_gtm_UA-85005767-1=1; _dc_gtm_UA-85005767-2=1; _dc_gtm_UA-85005767-13=1; SHA256_email=e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855; _uetsid=773915c0af6d11eea610e1aae275dd00; _uetvid=77390610af6d11ee8e21578fc2efaa08; _ga=GA1.1.911342554.1704859518; _ga_LJF2ZPHK2H=GS1.1.1704859518.1.1.1704860252.60.0.0; _dd_s=rum=0&expire=1704861152445; __cf_bm=Y2EhWUNV462OmWgqW23afrrJuRjSd.UC3_4LsEJ8UdE-1704859702-1-AfvtwTn9hUQpO2hcJ38CtVICtAnYCli0vc8uwIf4T8j+wafygX1OmG4ZxoCwpWAkr7YA9PgVcPT0lxYGyUi09hU=");
        headers.put("expires", "-1");
        headers.put("general-key", "");
        headers.put("origin", "https://global.almosafer.com");
        headers.put("pragma", "no-cache");
        headers.put("referer", "https://global.almosafer.com/en/hotel/details/atg/atlantis-the-royal-1888776");
        headers.put("sec-ch-ua", "\"Not_A Brand\";v=\"8\", \"Chromium\";v=\"120\", \"Google Chrome\";v=\"120\"");
        headers.put("sec-ch-ua-mobile", "?0");
        headers.put("sec-ch-ua-platform", "\"macOS\"");
        headers.put("sec-fetch-dest", "empty");
        headers.put("sec-fetch-mode", "cors");
        headers.put("sec-fetch-site", "same-origin");
        headers.put("token", "4R!eVj7$&7Q8Duhv1#pB");
        headers.put("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        headers.put("x-api-key", "apikey-hotel");
        headers.put("x-app-name", "ct-web-hotels-desktop");
        headers.put("x-bt", "next");
        headers.put("x-currency", "USD");
        headers.put("x-locale", "en");
        headers.put("x-platform", "web");
        headers.put("x-tz", "Asia/Amman");
    }
}
