package ie.gmit;

public class Calculator {
    public Calculator() {}

    // this method will add two numbers
    public int add(int firstNumber, int secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0 && firstNumber <= 1000 && secondNumber <= 1000) {
            return firstNumber + secondNumber;
        } else {
            throw new IllegalArgumentException("Number(s) must be between 0 and 1000");
        }
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0 && firstNumber <= 1000 && secondNumber <= 1000) {
            return firstNumber - secondNumber;
        } else {
            throw new IllegalArgumentException("Number(s) must be between 0 and 1000");
        }
    }

    public float divide(int firstNumber, int secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0 && firstNumber <= 1000 && secondNumber <= 1000) {
            return (float) firstNumber / secondNumber;
        } else {
            throw new IllegalArgumentException("Number(s) must be between 0 and 1000");
        }
    }

    public int multiply(int firstNumber, int secondNumber) {
        if (firstNumber >= 0 && secondNumber >= 0 && firstNumber <= 1000 && secondNumber <= 1000) {
            return firstNumber * secondNumber;
        } else {
            throw new IllegalArgumentException("Number(s) must be between 0 and 1000");
        }
    }
}
