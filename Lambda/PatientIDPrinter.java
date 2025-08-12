import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(101, 102, 103, 104);

        // Method reference instead of lambda
        patientIDs.forEach(System.out::println);
    }
}
