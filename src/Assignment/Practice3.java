package Assignment;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers(integer): ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("num1 = "+num1+", num2 = "+num2);
        int addition = num1+num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;
        int division = num1/num2;
        int reminder = num1%num2;



        System.out.println(num1 + " + "+num2+" = "+addition );
        System.out.println(num1 + " - "+num2+" = "+subtraction );
        System.out.println(num1 + " * "+num2+" = "+multiplication );
        if (division == 0){
            System.out.println(num1 + " * "+num2+" = the quotient is "+ division+ " with a reminder of "+ reminder);
        }

    }

}
