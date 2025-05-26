import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day index (0-6): ");
        int index = scanner.nextInt();

        try {
            // Try to access the array element
            System.out.println("Day: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle case where index is out of bounds
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        }

        scanner.close();
    }
}
