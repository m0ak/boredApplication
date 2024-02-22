package at.upstream_mobility.itacademy.bored.app;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
@RequiredArgsConstructor
public class Command {
    private final Client client;

    @ShellMethod("get activity")
    public String get(@ShellOption(defaultValue = ShellOption.NULL) String type,
                      @ShellOption(defaultValue = ShellOption.NULL) Integer participants,
                      @ShellOption(defaultValue = ShellOption.NULL) Double price,
                      @ShellOption(defaultValue = ShellOption.NULL) Double accessibility) {
        BoredResponse activity = client.request(type, participants, price, accessibility);
        return activity.toString();
    }
}