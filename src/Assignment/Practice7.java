package Assignment;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.println(" Sales tax is " + (int)(tax * 100)/100.0);

    }
}
