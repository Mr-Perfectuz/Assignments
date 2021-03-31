package FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args){
        // file =  An abstract representation of a file and directory pathnames


        File file = new File("C:\\developer\\DSU\\src\\text.txt");
        if (file.exists()){
            System.out.println("That file exists ! ");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else {
            System.out.println("That file doesn't exist");
        }
    }
}