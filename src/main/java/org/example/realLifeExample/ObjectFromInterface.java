package org.example.realLifeExample;

public class ObjectFromInterface implements Operation {

    @Override
    public double calculate(double operandA, double operandB) {
        return operandA + operandB;
    }
}
