package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // exceptions = an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions

        Scanner scanner= new Scanner(System.in);
        try {

            System.out.println("Enter a whole number: ");
            int x = scanner.nextInt();

            System.out.println("Enter the second number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("The result is " + z);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println(" You can't divide a number by \"zero\"  ");
        }
        catch (InputMismatchException inputMismatchException) {
            System.out.println("You can't divide to a word ! ENTER A NUMBER ");
        }

        catch (Exception e){
            System.out.println("Something is wrong ! ");
        }
        finally {
            scanner.close();
        }


    }
}
