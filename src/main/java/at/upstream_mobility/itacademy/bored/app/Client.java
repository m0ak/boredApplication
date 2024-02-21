package at.upstream_mobility.itacademy.bored.app;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
//identifies essential parts and connects (only) them automatically; only works on final and @NonNull fields
@Component
//marks class as essential bean (component); automatically detects and manages it; allows Spring to provide other beans the class needs
public class Client {
    private final WebClient boredWebClient;

    public Response request(String type) {
        Response response = boredWebClient.get()
                .uri(uriBuilder -> uriBuilder.path("/api/activity").queryParam("type", type).build())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Response.class).block();
        return response;
    }
}