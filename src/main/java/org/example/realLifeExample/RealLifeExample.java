package org.example.realLifeExample;

import java.util.List;

public class RealLifeExample {

    public static void main(String[] args) {

        BinaryCalculator calculator = new BinaryCalculator();

        calculator.setOperandA(7);
        calculator.setOperandB(11);

        Operation operationBasedOnClass = new ObjectFromInterface();
        var result1 = calculator.calculate(operationBasedOnClass);
        System.out.println(result1);

        Operation operationBasedOnClass2 = new ObjectFromInterface2();
        var result2 = calculator.calculate(operationBasedOnClass2);
        System.out.println(result2);


        calculator.setOperandA(5);
        calculator.setOperandB(11);

        Operation ourAnonymousOperation = new Operation() {
            @Override public double calculate(double operandA, double operandB) {
                return operandA + operandB;
            }
        };
        System.out.println(calculator.calculate(ourAnonymousOperation));


        calculator.setOperandA(10);
        calculator.setOperandB(20);

        System.out.println(calculator.calculate(new Operation() {
            @Override public double calculate(double operandA, double operandB) {
                return operandA + operandB;
            }
        }));


        calculator.setOperandA(7);
        calculator.setOperandB(3);

        Operation lambda = (operandA, operandB) -> {
            var result = operandA - operandB;
            return result;
        };

        var result3 = calculator.calculate(lambda);

        var result5 = calculator.calculate((op1, op2) -> op1 + op2);

        // ovo znači: ajde kompajleru, napravi anonimnu klasu koja odgovara
        // tipu argumenta od calculator.calculate (to je tip Operation),
        // i kad je budeš implementirao, uzmi metodu add iz klase RealLifeExample
        var result4 = calculator.calculate(RealLifeExample::add);
    }

    static double add(double operandA, double operandB) {
        return operandA + operandB;
    }
}
