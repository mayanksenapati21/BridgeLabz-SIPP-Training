import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
    }
}
