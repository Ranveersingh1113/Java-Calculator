# Java-Calculator

Features
Addition: Adds two numbers.
Subtraction: Subtracts the second number from the first.
Multiplication: Multiplies two numbers.
Division: Divides the first number by the second, with a check to avoid division by zero.
Classes and Methods
1. Class: UserInput
Handles all user input, including selecting the operation and entering the numbers.

Method: userInput()
Description: Prompts the user to select an operation and input two numbers.
Return Value: An array of objects (Object[]) containing:
int choice: The user's choice of operation (1 for addition, 2 for subtraction, etc.).
int[] numbers: The two numbers entered by the user.
2. Class: Calculator
Performs the arithmetic operations based on user input.

Method: calculate()
Description: Executes the operation selected by the user.
Logic:
Uses a switch-case statement to perform addition, subtraction, multiplication, or division based on the user's choice.
Handles division by zero gracefully with an error message.
Return Value: The result of the selected operation (as an int).
3. Class: Main
The entry point of the application.

Method: main(String[] args)
Description: Creates an instance of the Calculator class and calls the calculate() method to display the result.
