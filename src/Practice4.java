import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer for seconds: ");
        int seconds = scanner.nextInt();

        int reminderSeconds = seconds%60;
        int minutes = seconds/60;

        System.out.println(seconds+" seconds is "+ minutes+" minutes "+" and "+reminderSeconds+" seconds ");

    }
}
