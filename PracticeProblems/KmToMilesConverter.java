import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        input.close();
    }
}