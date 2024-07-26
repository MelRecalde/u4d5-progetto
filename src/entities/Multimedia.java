package entities;

public abstract class Multimedia {
    // attributi
    public String title;
    private int duration;
    private String volume;
    private int brightness;

    public Multimedia(String title) {
        this.title = title;
        this.volume = "";
        this.brightness = 0;
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
