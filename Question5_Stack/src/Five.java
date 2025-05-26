import java.util.Stack;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is Stack Empty?");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter number to push: ");
                int num = input.nextInt();
                stack.push(num);
                System.out.println(num + " pushed.");
            } else if (choice == 2) {
                if (!stack.isEmpty()) {
                    int removed = stack.pop();
                    System.out.println("Popped: " + removed);
                } else {
                    System.out.println("Stack is empty.");
                }
            } else if (choice == 3) {
                System.out.println(stack.isEmpty() ? "Yes, empty." : "No, not empty.");
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
