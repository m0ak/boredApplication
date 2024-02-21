package at.upstream_mobility.itacademy.bored.app;

public record Response(String activity, String type, int participants, double price,
                       String link, String key, double accessibility) {

}