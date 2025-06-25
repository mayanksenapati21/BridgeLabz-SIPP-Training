import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a (meters): ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b (meters): ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c (meters): ");
        double c = scanner.nextDouble();
        double rounds = calculateRounds(a, b, c);
        System.out.printf("Number of rounds required: %.2f\n", rounds);
    }
}
