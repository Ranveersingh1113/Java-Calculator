class Calculator {
    
    public int calculate() {
        UserInput in = new UserInput();
        Object[] inputs = in.userInput();

        int choice = (int) inputs[0]; // User's choice of operation
        int[] numbers = (int[]) inputs[1]; // Numbers entered by the user

        int result = 0;
        switch (choice) {
            case 1:
                result = numbers[0] + numbers[1];
                break;
            case 2:
                result = numbers[0] - numbers[1];
                break;
            case 3:
                result = numbers[0] * numbers[1];
                break;
            case 4:
                if (numbers[1] != 0) {
                    result = numbers[0] / numbers[1];
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                return 0;
        }
        return result;
    }
}