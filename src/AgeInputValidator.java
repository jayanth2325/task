import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputValidator {

        public int getValidAge() {
            Scanner scanner = new Scanner(System.in);
            int age = 0;
            boolean valid = false;

            while (!valid) {
                try {
                    System.out.print("Please enter your age (1-120): ");
                    age = scanner.nextInt();

                    if (age >= 1 && age <= 120) {
                        valid = true;
                    } else {
                        System.out.println("Invalid input. Age must be between 1 and 120.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Clear the invalid input
                }
            }

            return age;
        }

        public static void main(String[] args) {
            AgeInputValidator validator = new AgeInputValidator();
            int validAge = validator.getValidAge();
            System.out.println("You entered a valid age: " + validAge);
        }
    }
