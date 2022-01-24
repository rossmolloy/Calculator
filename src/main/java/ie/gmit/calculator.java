package ie.gmit;

public class calculator {
    private int firstNumber;
    private int secondNumber;

    public calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }
}
