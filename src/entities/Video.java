package entities;

import interfaces.Brightness;
import interfaces.Duration;
import interfaces.Volume;

public class Video extends Multimedia implements Duration, Brightness, Volume {
    private int volume;
    private int duration;
    private String brightness;
}