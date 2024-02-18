package at.upstream_mobility.itacademy.bored.app;

public record Response(String activity, String type, int participants, int price,
                       String link, String key, double accessibility) {

}