package Assignment;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double avarageNumber = (number1+number2+number3)/3;
        System.out.println("The average of "+number1+" "+number2+" "+number3+" is "+avarageNumber);
    }
}
