package entities;

import interfaces.Duration;
import interfaces.Volume;

import java.util.Scanner;

public class Audio extends Multimedia implements Duration, Volume {

    public Audio(String title) {
        super(title);
    }

    @Override
    public void play() {

    }

    @Override
    public void volume(int volume) {
        Scanner scan = new Scanner(System.in);
        String vol = scan.nextLine();
        System.out.println("To increase the volume: + | To lower the volume : -");

    }
}
