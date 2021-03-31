package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(System[] args){
        // FileReader = read the contents of a file as a stream of characters. One by one
        //              read() returns an int value which contains the byte value when read()
        //              returns -1, there is no more date to be read

        try {
            FileReader fileReader = new FileReader("C:\\developer\\DSU\\art.txt");
            int date = fileReader.read();
            while (date!= -1){
                System.out.print((char) date);
                date = fileReader.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
