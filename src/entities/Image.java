package entities;

import interfaces.Brightness;

public class Image extends Multimedia implements Brightness {
    // ATTRIBUTI
    private String brightness;

    public Image(String title, String brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void light(int light) {
        System.out.println(getTitle() + light);
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Image{" +
                "title: '" + title + '\'' +
                " , brightness: '" + brightness + '\'' +
                '}';
    }
}
