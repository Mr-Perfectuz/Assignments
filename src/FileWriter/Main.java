package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static  void main(String[] args){

        try {
            FileWriter fileWriter = new FileWriter("poems.txt");
            fileWriter.write("Roses are red");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
