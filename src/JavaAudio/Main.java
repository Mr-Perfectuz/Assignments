package JavaAudio;
import javax.sound.sampled.*;
import java.io.File;

public class Main {
    public static void main(String[] args){

        File file = new File("C:\\developer\\DSU\\src\\JavaAudio\\19th_Floor.wav");

        if (file.exists()){
            System.out.println("File exists");
        }
    }
}
