import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Keep displaying the menu and processing user choices until exit
        do {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            handleMenuChoice(choice);
        } while (choice != 3); // Continue until user chooses option 3 to exit

        // Close the scanner resource
        scanner.close();
    }

    // Method to display the menu options to the user
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser(); // Greet the user
                break;
            case 2:
                checkEvenOrOdd(); // Check if a number is even or odd
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!"); // Exit message
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option (1-3)."); // Invalid input
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if the given number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in); // Create a new scanner for the check
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using the modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
