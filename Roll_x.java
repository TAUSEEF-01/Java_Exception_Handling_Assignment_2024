// import java.util.Scanner;

// // Custom Exceptions
// class FirstNameAbsence extends Exception {
//     public FirstNameAbsence(String message) {
//         super(message);
//     }
// }

// class LastNameAbsence extends Exception {
//     public LastNameAbsence(String message) {
//         super(message);
//     }
// }

// class NoNamePresent extends Exception {
//     public NoNamePresent(String message) {
//         super(message);
//     }
// }

// // Define other custom exceptions similarly

// public class Roll_x { // Replace x with your roll number
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Take input for each field
//         try {
//             System.out.println("Enter First Name:");
//             String firstName = scanner.nextLine();
//             if (firstName.isEmpty())
//                 throw new FirstNameAbsence("First Name cannot be empty.");

//             // Similarly, take input for middle name, last name, email, NID/passport, birthdate, and address

//             // Handle exceptions for each input field

//         } catch (FirstNameAbsence e) {
//             System.out.println(e.getMessage());
//             // Log or handle the exception further if needed
//         } catch (Exception e) {
//             System.out.println("An unexpected error occurred: " + e.getMessage());
//             // Log or handle the exception further if needed
//         } finally {
//             scanner.close();
//         }

//         // Store inputs in arrays or data structures for further processing

//         // Handle querying logic
//     }
// }











import java.util.Scanner;

// Custom exceptions for name-related validations
class FirstNameAbsence extends Exception {
    public FirstNameAbsence(String message) {
        super(message);
    }
}

class LastNameAbsence extends Exception {
    public LastNameAbsence(String message) {
        super(message);
    }
}

class NoNamePresent extends Exception {
    public NoNamePresent(String message) {
        super(message);
    }
}

public class Roll_x { // Replace x with your roll number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take input for first name
            System.out.println("Enter First Name:");
            String firstName = scanner.nextLine();

            // Take input for last name
            System.out.println("Enter Last Name:");
            String lastName = scanner.nextLine();

            // Validate names
            validateName(firstName, lastName);

            // If validation passes, print the names
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);

        } catch (FirstNameAbsence | LastNameAbsence | NoNamePresent e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate the name fields
    public static void validateName(String firstName, String lastName) throws FirstNameAbsence, LastNameAbsence, NoNamePresent {
        // Check for absence of first name and last name
        if (firstName.isEmpty() && lastName.isEmpty()) {
            throw new NoNamePresent("Both first name and last name are absent.");
        } else if (firstName.isEmpty()) {
            throw new FirstNameAbsence("First name is absent.");
        } else if (lastName.isEmpty()) {
            throw new LastNameAbsence("Last name is absent.");
        }
    }
}
