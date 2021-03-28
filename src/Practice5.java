import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double Celsius =  (Fahrenheit-32) *5/9;

        System.out.println("Fahrenheit "+Fahrenheit+" is "+Celsius+" in Celsius");

    }
}

