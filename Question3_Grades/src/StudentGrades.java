import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    // HashMap to store student names and grades
    static HashMap<String, Integer> grades = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    // Method to add a new student
    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade (number): ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // consume newline
        grades.put(name, grade);
        System.out.println("Student added successfully!");
    }

    // Method to remove a student
    public static void removeStudent() {
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Method to display a student's grade
    public static void displayGrade() {
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            System.out.println(name + "'s grade: " + grades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Grade Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: displayGrade(); break;
                case 4: System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
