package ie.gmit;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // this method will add two numbers
    public int add() {
        return firstNumber + secondNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber;
    }

    public float divide() {
        return (float) firstNumber / secondNumber;
    }
}
