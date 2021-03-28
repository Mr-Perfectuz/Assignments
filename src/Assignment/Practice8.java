package Assignment;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double monthlyinterestRate, loanAmount, numberOfYears, monthlyPayment, totalPayment, x, y;

        System.out.println("Enter annual interest rate, e.g., 4.56%: ");
        monthlyinterestRate = scanner.nextDouble();

        System.out.println("Enter number of years as an integer, e.g., 5: ");
        numberOfYears = scanner.nextDouble();

        System.out.println("Enter loan amount, e.g., 120000.95: ");
        loanAmount = scanner.nextDouble();


        monthlyinterestRate = (double) (monthlyinterestRate * 100) / 100;
        monthlyinterestRate = monthlyinterestRate / 12;


        x = ((loanAmount * monthlyinterestRate));
        y = (1 - (1 / Math.pow(1 + monthlyinterestRate, numberOfYears * 12)));

        monthlyPayment = x / y;

        totalPayment = (monthlyPayment * numberOfYears * 12);


        System.out.printf("The monthly payment is $ %.2f%n", monthlyPayment);
        System.out.printf("The total payment is $ %.2f%n", totalPayment);


    }
}
