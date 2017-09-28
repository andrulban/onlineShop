package andruha_denia.online_shop.config;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author azozello
 * @since 28.09.17.
 */

@Component
public class AddHeaderInterceptor implements ClientHttpRequestInterceptor {

    private final String logPass = "user:pass";

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        byte[] bytesEncoded = Base64.encodeBase64(logPass.getBytes());
        String passHeader = "Basic "+new String(bytesEncoded);

        HttpHeaders headers = request.getHeaders();
        headers.add("Authorization", passHeader);

        return execution.execute(request, body);
    }
}
