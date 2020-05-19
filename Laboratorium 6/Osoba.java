package hello;
public class Osoba {
    private final long id;
    private final String content;
    private final String wiek;


    public Osoba(long id, String content,String wiek) {
        this.id = id;
        this.content = content;
        this.wiek= wiek;
    }
    public long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    public String getWiek() {
        return wiek;
    }
}