package Dynamic_Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Polymorphism = many shapes/forms
//        dynamic = after compilation (during runtime)

         Animal animal;
         Dog dog;
         Cat cat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want ?");
        System.out.println("(1 = dog) or (2 = cat)");

        int choice = scanner.nextInt();
    }
}
