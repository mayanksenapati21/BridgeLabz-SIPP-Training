public class NestedTryCatchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 1; // Test with out-of-range
        int divisor = 0; // Test with 0

        try {
            try {
                int value = arr[index];
                try {
                    System.out.println("Result: " + (value / divisor));
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}
