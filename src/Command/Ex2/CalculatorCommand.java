package Command.Ex2;

public class CalculatorCommand implements Command {


    private char operator;
    private int operand;
    private Calculator calculator;

    public CalculatorCommand(char operator, int operand, Calculator calculator) {
        this.operator = operator;
        this.operand = operand;
        this.calculator = calculator;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getOperand() {
        return operand;
    }

    public void setOperand(int operand) {
        this.operand = operand;
    }

    @Override
    public void execut() {
        calculator.operation(operator, operand);
    }

    @Override
    public void unExecut() {
        calculator.operation(undo(operator), operand);
    }

    public char undo(char operator) {
        char undo;
        switch (operator) {
            case '+':
                undo = '-';
                break;
            case '-':
                undo = '+';
                break;
            case '*':
                undo = '/';
                break;
            case '/':
                undo = '*';
                break;
            default:
                undo = ' ';
                break;
        }
        return undo;
    }
}
