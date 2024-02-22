package at.upstream_mobility.itacademy.bored.app;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@RequiredArgsConstructor
@Component
public class Client {
    private final WebClient boredWebClient;

    public BoredResponse request(String type, Integer participants, Double price, Double accessibility) {
        return boredWebClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/activity")
                        .queryParam("type", type)
                        .queryParam("participants", participants)
                        .queryParam("price", price)
                        .queryParam("accessibility", accessibility)
                        .build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(BoredResponse.class)
                .block(Duration.ofSeconds(5));
    }
}