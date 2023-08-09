package org.example.realLifeExample;

import java.util.ArrayList;

public class BinaryCalculator {

    private double operandA;
    private double operandB;

    public void setOperandA(double operandA) {
        if (operandA < 0) {
            throw new IllegalArgumentException("Operand je veći od nule");
        }
        this.operandA = operandA;
    }

    public void setOperandB(double operandB) {
        this.operandB = operandB;
    }

    public double calculate(Operation operation) {
        return operation.calculate(operandA, operandB);
    }

}
