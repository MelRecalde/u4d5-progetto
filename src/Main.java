import entities.Audio;
import entities.Image;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Image image = new Image("Image", "***");
        Video video = new Video("Video", 3, 2, 3);
        Audio audio = new Audio("Audio", 5, 1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What kind of multimedia you want? Enter 1 for Image , 2 for Video , 3 for Audio");
        int answer = scanner.nextInt();

        switch (answer) {
            case 0:
                break;
            case 1:
                System.out.println(image);
                break;
            case 2:
                System.out.println(video);
                break;
            case 3:
                System.out.println(audio);
                break;
            default:
                System.out.println("enter 1 for Image, 2 for Video, 3 for Audio");

        }
    }
}