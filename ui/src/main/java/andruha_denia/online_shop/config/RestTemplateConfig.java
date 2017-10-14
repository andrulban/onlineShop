package andruha_denia.online_shop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;

/**
 * @author  azozello
 * @since 28.09.17.
 */
@Configuration
public class RestTemplateConfig {

    @Autowired
    private AddHeaderInterceptor addHeaderInterceptor;

    @Bean
    RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        LinkedList<ClientHttpRequestInterceptor> clientHttpRequestInterceptors = new LinkedList<>();
        clientHttpRequestInterceptors.add(addHeaderInterceptor);

        restTemplate.setInterceptors(clientHttpRequestInterceptors);
        return restTemplate;
    }
}
