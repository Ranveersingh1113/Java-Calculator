import java.util.*;


class UserInput {
    
    Object[] userInput() {
        int choice;
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        choice = scan.nextInt();

        System.out.println("Enter the first number:");
        numbers[0] = scan.nextInt();

        System.out.println("Enter the second number:");
        numbers[1] = scan.nextInt();

        return new Object[]{choice, numbers};
    }
}