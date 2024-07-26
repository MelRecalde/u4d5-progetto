package entities;

import interfaces.Brightness;

public class Image extends Multimedia implements Brightness {
    // ATTRIBUTI
    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void light(int light) {
        System.out.println(getTitle() + light);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
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
