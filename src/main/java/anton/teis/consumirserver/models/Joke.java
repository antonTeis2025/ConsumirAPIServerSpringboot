package anton.teis.consumirserver.models;

public record Joke(
        String created_at,
        String icon_url,
        String id,
        String updatedAt,
        String url,
        String value
) {
    @Override
    public String value() {
        return value;
    }
}
