package entities;

import interfaces.Brightness;
import interfaces.Duration;
import interfaces.Volume;

public class Video extends Multimedia implements Duration, Brightness, Volume {
    private int volume;
    private int duration;
    private int brightness;

    public Video(String title, int volume, int duration, int brightness) {
        super(title);
        this.volume = volume;
        this.duration = duration;
        this.brightness = brightness;
    }

    @Override
    public void light(int light) {
        System.out.println(getTitle() + "!".repeat(duration) + "*".repeat(brightness));
    }

    @Override
    public void duration() {

    }

    @Override
    public void volume(int volume) {

    }
}