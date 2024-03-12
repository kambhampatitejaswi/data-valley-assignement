// CustomValidationException class
class CustomValidationException extends Exception {
    // Constructor
    public CustomValidationException(String message) {
        super(message);
    }
}

// Main class
public class Main {
    // Method to validate number and throw CustomValidationException if negative
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative: " + number);
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            int number = -5; // Example input
            validateNumber(number);
            System.out.println("Number is valid: " + number);
        } catch (CustomValidationException e) {
            System.out.println("CustomValidationException caught: " + e.getMessage());
        }
    }
}
