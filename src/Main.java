import entities.Audio;
import entities.Image;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What kind of multimedia you want? Enter 1 for Image , 2 for Video , 3 for Audio");
        int answer = scanner.nextInt();

        switch (answer) {
            case "1":
                Image;
            case "2":
                Video;
            case "3":
                Audio;
            default:
                System.out.println("enter 1 for Image, 2 for Video, 3 for Audio");
        }
    }
}