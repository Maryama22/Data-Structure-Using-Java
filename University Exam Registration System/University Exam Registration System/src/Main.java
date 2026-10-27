import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExamRegistration reg = new ExamRegistration();

        System.out.println("===== EXAM REGISTRATION SYSTEM =====\n");

        try {
            reg.collectData(sc);
            reg.displaySuccess();
        } catch (InvalidRegistrationException e) {
            System.out.println("\nRegistration Failed!");
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nRegistration attempt completed.");
            sc.close();
        }
    }
}