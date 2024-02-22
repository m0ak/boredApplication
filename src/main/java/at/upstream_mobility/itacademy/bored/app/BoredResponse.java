package at.upstream_mobility.itacademy.bored.app;

public record BoredResponse(String activity, String type, int participants, double price,
                            String link, String key, double accessibility) {
    @Override
    public String toString() {
        return "activity='" + activity + '\'' +
                ", type='" + type + '\'' +
                ", participants=" + participants +
                ", price=" + price +
                ", link='" + link + '\'' +
                ", accessibility=" + accessibility;
    }
}