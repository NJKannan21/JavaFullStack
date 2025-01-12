package guviPortalTask4;
import java.util.Stack;
import java.util.Scanner;
public class IntegerStack {
	private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int removedElement = stack.pop();
            System.out.println("Popped " + removedElement + " from the stack.");
        } else {
            System.out.println("Stack is empty. Nothing to pop.");
        }
    }

    // Method to check if the stack is empty
    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        IntegerStack integerStack = new IntegerStack();

        while (true) {
            System.out.println("\nInteger Stack Operations:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push Element
                    System.out.print("Enter an integer to push: ");
                    int element = scanner.nextInt();
                    integerStack.pushElement(element);
                    break;

                case 2: // Pop Element
                    integerStack.popElement();
                    break;

                case 3: // Check if Stack is Empty
                    if (integerStack.isStackEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
}
