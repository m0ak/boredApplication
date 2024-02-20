package at.upstream_mobility.itacademy.bored.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration  //defines bean (=components the application needs) configurations; uses @Bean methods; enables auto-configuration; allows customization
public class WebClientConfig {
    @Bean   //identifies method within @Configuration class; defines bean details: bean type (service / repository bean), dependencies, lifecycle
    public WebClient boredWebClient(WebClient.Builder webClientBuilder) {
        return webClientBuilder
                .baseUrl("https://www.boredapi.com/api/activity/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}