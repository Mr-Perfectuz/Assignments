package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static  void main(String[] args){

        try {
            FileWriter fileWriter = new FileWriter("art.txt");
            fileWriter.write("Roses are red \nViolets are blue");
            fileWriter.append("\n(Written by Mr.Perfect)");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
