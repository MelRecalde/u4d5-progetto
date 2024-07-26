package entities;

import interfaces.Duration;
import interfaces.Volume;

import java.util.Scanner;

public class Audio extends Multimedia implements Duration, Volume {
    private int duration;
    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public void duration() {
        for (int i = 0; i < duration; i++) {
            System.out.println(getTitle() + "!".repeat(volume));
        }
    }

    @Override
    public void volume(int volume) {
        Scanner scan = new Scanner(System.in);
        String vol = scan.nextLine();
        System.out.println("To increase the volume: + | To lower the volume : -");
    }

    @Override
    public String toString() {
        return "Audio{" +
                "title: " + title +
                " , duration: " + duration +
                " , volume: '" + volume + '\'' +
                '}';
    }
}
