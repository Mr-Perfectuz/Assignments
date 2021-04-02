package DSU;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        System.out.println("==============  Calculating BMI ===============");

        double weight, height, BMI;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight(kg): ");
        weight = scanner.nextDouble();

        System.out.println("Enter your height(m): ");
        height = scanner.nextDouble();
//        String.format("%s",height);

        BMI = weight / Math.pow(height,2);

        if (BMI < 18.5){
            System.out.println("Underweight");
        }
        else if(BMI>= 18.5 && BMI<=25.0){
            System.out.println("Normal");
        }
        else if(BMI>= 25.5 && BMI<=30.0){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }

        System.out.println("Your BMI is " + BMI);
    }
}
