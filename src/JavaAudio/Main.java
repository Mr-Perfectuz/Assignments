package JavaAudio;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\developer\\DSU\\src\\JavaAudio\\19th_Floor.wav");

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);



        String response = "";


        while (!response.equals("Q")){
            System.out.println("P = play  \nS = stop \nR = reset  \nQ = quit ");
            System.out.println("Enter your choice ");

            response = scanner.next();
            response = response.toUpperCase();
        }

        clip.start();
    }
}
