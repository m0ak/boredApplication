package at.upstream_mobility.itacademy.bored.app;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

@ShellComponent
//marks command-containing class; discovers commands automatically (@ShellMethod); simplifies command creation
@RequiredArgsConstructor
public class Command {
    private final Client client;

    @ShellMethod("get activity")
    public String get(String type) {
        Response activity = client.request(type);
        return activity.toString();
    }
}