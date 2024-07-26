package entities;

public class Multimedia {
    // attributi
    public String title;
    private int duration;
    private int volume;
    private String brightness;

    public Multimedia(String title) {
        this.title = title;
        this.volume = 0;
        this.brightness = "";
        this.duration = 0;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
