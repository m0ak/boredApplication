package at.upstream_mobility.itacademy.bored.app;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Component;

@ShellComponent
public class Command {

    @ShellMethod("get activity")
    public String getActivity() {

        return "ninja";
    }
}