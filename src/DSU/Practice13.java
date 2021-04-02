package DSU;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;

        for (int i=0; i<5; i++){
            System.out.println(" enter 5 integers");
            num = scanner.nextInt();
//            Here I tried to use the break but it stops the program running whenever I entered the negative number

//            if (num<0)
//                break;

            if(num > 0)
                sum+= num;
        }
        System.out.println("Sum of positive integers: " + sum);
        




    }
}
