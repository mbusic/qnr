package org.example.realLifeExample;

public class BinaryCalculator {

    public double operandA;
    public double operandB;

    public void setOperandA(double operandA) {
        this.operandA = operandA;
    }

    public void setOperandB(double operandB) {
        this.operandB = operandB;
    }

    public double calculate(Operation operation) {
        return operation.calculate(operandA, operandB);
    }

}
