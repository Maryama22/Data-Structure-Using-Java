import java.util.Scanner;

// Custom exception
class InvalidRegistrationException extends Exception {
    public InvalidRegistrationException(String message) {
        super(message);
    }
}

class ExamRegistration {
    private String studentId, name;
    private int age, mark, subjects;

    public void collectData(Scanner sc) throws InvalidRegistrationException {
        System.out.print("Enter Student ID: ");
        studentId = sc.nextLine().trim();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine().trim();

        System.out.print("Enter Age: ");
        age = readInt(sc.nextLine(), "Age");

        System.out.print("Enter Exam Mark: ");
        mark = readInt(sc.nextLine(), "Exam mark");

        System.out.print("Enter Number of Subjects: ");
        subjects = readInt(sc.nextLine(), "Number of subjects");

        validate();
    }

    private int readInt(String text, String field) throws InvalidRegistrationException {
        try {
            return Integer.parseInt(text.trim());
        } catch (NumberFormatException e) {
            throw new InvalidRegistrationException(field + " must be a valid number.");
        }
    }

    private void validate() throws InvalidRegistrationException {
        if (studentId.isEmpty()) {
            throw new InvalidRegistrationException("Student ID cannot be empty.");   // throw
        }
        if (age < 18) {
            throw new InvalidRegistrationException("Age must be at least 18.");
        }
        if (mark < 0 || mark > 100) {
            throw new InvalidRegistrationException("Exam mark must be between 0 and 100.");
        }
        if (subjects < 1) {
            throw new InvalidRegistrationException("Minimum allowed subjects is 1.");
        }
        if (subjects > 5) {
            throw new InvalidRegistrationException("Maximum allowed subjects is 5.");
        }
    }

    public void displaySuccess() {
        System.out.println("\nRegistration Successful!");
        System.out.println("Student: " + name);
        System.out.println("Registered Subjects: " + subjects);
    }
}

